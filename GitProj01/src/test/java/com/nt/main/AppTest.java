package com.nt.main;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
   
    public AppTest( String testName )
    {
        super( testName );
    }
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testSumWithPositives()
    {
        App app=new App();
        int expected=300;
        int actual=app.sum(100,200);
        assertEquals(expected,actual);
    }
    public void testSumWithNegatives()
    {
        App app=new App();
        int expected=-100;
        int actual=app.sum(100,-200);
        assertEquals(expected,actual);
    }
    public void testSumWithMixedValues()
    {
        App app=new App();
        int expected=-300;
        int actual=app.sum(-100,-200);
        assertEquals(expected,actual);
    }
    public void testSumWithZeros()
    {
        App app=new App();
        int expected=0;
        int actual=app.sum(0,0);
        assertEquals(expected,actual);
    }



}
