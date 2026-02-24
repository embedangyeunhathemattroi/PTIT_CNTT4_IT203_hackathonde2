package session1.bai3;

public class SwapBook {
    public static void main(String[] args) {

        // Khai báo biến
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        System.out.println("Trước khi hoán đổi:");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);

        // Hoán đổi bằng biến tạm
        String temp = book1;
        book1 = book2;
        book2 = temp;

        System.out.println("\nSau khi hoán đổi:");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);

    }
}
