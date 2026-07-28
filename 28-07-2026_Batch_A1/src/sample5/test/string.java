package sample5.test;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        StringBuilder s2=new StringBuilder("Python");
        s2.append("Language");
        System.out.println(s2);
        s2.insert(1, "abcd");
        System.out.println(s2);
        s2.replace(1, 5, "xyz3");
        System.out.println(s2);
    }
}
