package sample5.test;

import java.util.Arrays;
import java.util.Locale;

public class Sample {
    public static void main(String[]args){

        //Mutable StringBuilder,StringBuffer
        StringBuilder s1=new StringBuilder("Java");
        System.out.println(s1);
        StringBuilder s2=new StringBuilder("Python");
        System.out.println(s2);
        s2.append("Language");
        System.out.println(s2);
        s2.insert(1, "abcd");
        System.out.println(s2);
        s2.replace(1, 5, "xyz3");
        System.out.println(s2);
        s2.reverse();
        System.out.println(s2);
        s2.delete(2,5);
        System.out.println(s2);

        //Immutable String-2 ways to create
        //Type-1 declaration
        String s3=("Java");
        //Type-2 declaration
        String s4=new String("java");
        String x="java";
        String y="java";
        System.out.println(x==y);

        //Inbuilt methods built in String class
        String z="RajRamohanRoy";
        System.out.println(z.charAt(5));
        System.out.println(z.toLowerCase());
        System.out.println(z.toUpperCase());
        System.out.println(z.indexOf('R'));
        System.out.println(z.lastIndexOf('R'));
        System.out.println(z.substring(1,5));
        System.out.println(z.length());
        String a="nitte";
        String b="Nitte";
       // System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        char arr[]=z.toCharArray();
        System.out.println(Arrays.toString(arr));









    }
}
