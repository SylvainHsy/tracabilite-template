package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App 
{
/**
 * 
 * @param args la fonction pour retourner "hello world!"
 */
    public static void main( String[] args )
    {
        System.out.println(hello());
    }
/**
 * @param string
 * @return hello world!
 */
    public static String hello() {
        return  "Hello World!";
    }

/**
 * 
 * @param param
 * @return param
 */
    public static String hello(String param) {
        return  param ;
    }
    
}
