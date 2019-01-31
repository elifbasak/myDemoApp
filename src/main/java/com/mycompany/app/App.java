package com.mycompany.app;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

public class App{

public static String metot(int dizi1[],int dizi2[],int a,int b,String []array1){
String tempp="";
	for(int i=0;i<dizi1.length&& i<dizi2.length;i++){
		if(dizi1[a]==dizi2[b])
		{
			tempp=array1[(a+b)%array1.length];
			return tempp;
		}
		
	}
	return null;
}
//public static  void main (String[]args){
//	int dizi1[]={1,2,3,4,5};
//	int dizi2[]={2,2,3,3,5};
//	int a=2;
//	int b=3;
//	String [] array1={"bir","iki","uc","dort","bes"};
//String neww=metot(dizi1,dizi2,a,b,array1);
//System.out.println(neww);
//}
 public static boolean search(ArrayList<Integer> array, int e) {
      System.out.println("inside search");
      if (array == null) return false;

      for (int elt : array) {
        if (elt == e) return true;
      }
      return false;
    }

    public static void main(String[] args) {
        port(getHerokuAssignedPort());

        get("/", (req, res) -> "Hello, World");

        post("/compute", (req, res) -> {
          //System.out.println(req.queryParams("input1"));
          //System.out.println(req.queryParams("input2"));

          String input1 = req.queryParams("input1");
          java.util.Scanner sc1 = new java.util.Scanner(input1);
          sc1.useDelimiter("[;\r\n]+");
          java.util.ArrayList<Integer> inputList = new java.util.ArrayList<>();
          while (sc1.hasNext())
          {
            int value = Integer.parseInt(sc1.next().replaceAll("\\s",""));
            inputList.add(value);
          }
          System.out.println(inputList);


          String input2 = req.queryParams("input2").replaceAll("\\s","");
          int input2AsInt = Integer.parseInt(input2);

          boolean result = App.search(inputList, input2AsInt);

         Map map = new HashMap();
          map.put("result", result);
          return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());


        get("/compute",
            (rq, rs) -> {
              Map map = new HashMap();
              map.put("result", "not computed yet!");
              return new ModelAndView(map, "compute.mustache");
            },
            new MustacheTemplateEngine());
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
    return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }




}