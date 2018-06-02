package com.quiz.TeenNumberChecker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
    }
    public static boolean hasTeen(int one, int two, int three) {
    	if (one >= 13 && one <= 19 || two >= 13 && two <= 19 || three >= 13 && three <= 19)
    		return true;
    	else return false;
    }
}

