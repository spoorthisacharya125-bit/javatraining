package sample5.test;

public class Demo {
    public static void main(String[]args) {
        Employee e1=new Employee();
        System.out.println(e1.name);
        System.out.println(e1.age);
//        System.out.println(e1.salary);
        e1.setData(650000.0);
        System.out.println(e1.getData());
    }
}
class Employee{
    private double salary;
    String name="Dishashetty";
    int age=20;
    public void setData(double sal)
    {
        salary =sal;
    }
    public double getData(){
        return salary;
    }
}