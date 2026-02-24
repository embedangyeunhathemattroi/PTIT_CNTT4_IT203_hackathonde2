class Student {
    String name;
}

public class b2 {
    public static void main(String[] args) {

        int a = 10;
        int b = a;
        b = 20;

        System.out.println("PRIMITIVE:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("-------------------");
        Student s1 = new Student();
        s1.name = "Nguyen Van A";

        Student s2 = s1;
        s2.name = "Tran Van B";

        System.out.println("REFERENCE:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
