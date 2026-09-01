import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer>t=new TreeSet<>();
        t.add(10);
        t.add(20);
        t.add(30);
        t.add(140);
        System.out.println(t);
        System.out.println(t);
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.headSet(25));
        System.out.println(t.tailSet(25));
        System.out.println(t.higher(20));
        System.out.println(t.lower(11));

        }
    }
