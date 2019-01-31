package com.mycompany.app;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }


    public void testApp()
    {
        assertTrue( true );
    }
	public void testApp2(){
	int  [] dizi1={1,2,3,4,5};
	int [] dizi2={2,2,3,3,5};
	int a=2;
	int b=3;
	



String  [] array1= {"bir","iki","uc","dort","bes"};
String neww = App.metot(dizi1,dizi2,a,b,array1);



assertEquals(neww,"bir");
}
public void testApp3(){
	int  [] dizi1={2,5,6,7,9,10,11};
	int [] dizi2={2,2,3,3,5,5,6};
	int a=5;
	int b=3;
	



String  [] array1= {"bir","iki","uc","dort","bes"};
String neww = App.metot(dizi1,dizi2,a,b,array1);



assertEquals(neww,null);
}
public void testApp4(){
	int  [] dizi1={2,5,6,7,9,10,11};
	int [] dizi2={2,2,3,3,5,5,6};
	int a=1;
	int b=5;
	



String  [] array1= {"bir","iki","uc","dort","bes"};
String neww = App.metot(dizi1,dizi2,a,b,array1);



assertEquals(neww,"iki");
}
public void testApp5(){
	int  [] dizi1={2,5,6,7,9,10,11};
	int [] dizi2={2,2,5,3,5,5,6};
	int a=1;
	int b=2;
	



String  [] array1= {"bir","iki","uc","dort","bes"};
String neww = App.metot(dizi1,dizi2,a,b,array1);



assertEquals(neww,"dort");
}


}
