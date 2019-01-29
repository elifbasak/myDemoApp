package com.mycompany.app;

/**
 * Hello world!
 *
 */
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
public static  void main (String[]args){
	int dizi1[]={1,2,3,4,5};
	int dizi2[]={2,2,3,3,5};
	int a=2;
	int b=3;
	String [] array1={"bir","iki","uc","dort","bes"};
String neww=metot(dizi1,dizi2,a,b,array1);
System.out.println(neww);
}

}