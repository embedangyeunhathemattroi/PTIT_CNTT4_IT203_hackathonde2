package session1.bai1;

import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();

        System.out.print("Nhập giá tiền: ");
        double price = sc.nextDouble();

        System.out.print("Sách còn không? (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        // Xử lý
        int age = 2026 - publishYear;
        String status = isAvailable ? "Còn sách" : "Đã mượn";

        // Xuất phiếu thông tin
        System.out.println("\n===== PHIẾU THÔNG TIN SÁCH =====");
        System.out.println("Mã sách      : " + bookID);
        System.out.println("Tên sách     : " + bookName.toUpperCase());
        System.out.println("Năm XB       : " + publishYear);
        System.out.println("Tuổi thọ     : " + age + " năm");
        System.out.printf("Giá tiền     : %.2f\n", price);
        System.out.println("Tình trạng   : " + status);
        System.out.println("==============================");

        sc.close();
    }
}
