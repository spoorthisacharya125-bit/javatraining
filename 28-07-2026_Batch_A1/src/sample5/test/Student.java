package sample5.test;

public class Student {
    String name;
    int age;
    String branch;
    static String college;
    public static void main(String[]args)
    {
        Student s1=new Student();
        s1.name="riya";
        s1.age=15;
        s1.branch="CSE";
        System.out.println(s1.name=" "+s1.age+" "+s1.branch+" "+college);
        Student s2=new Student();
        s2.name="Dishashetty";
        s2.age=20;
        s2.branch="CSE";
        System.out.println(s2.name=" "+s2.age+" "+s2.branch+" "+college);

    }
}
