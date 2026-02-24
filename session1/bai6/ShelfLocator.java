package session1.bai6;

import java.util.Scanner;

public class ShelfLocator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ tự sách (stt): ");
        int stt = sc.nextInt();

        // Tính kệ và vị trí
        int shelf = (stt - 1) / 25 + 1;
        int position = (stt - 1) % 25 + 1;

        // Xác định khu vực bằng toán tử điều kiện
        String area = shelf <= 10 ? "Khu Cận" : "Khu Viễn";

        // In địa chỉ
        System.out.println("\n===== ĐỊNH VỊ SÁCH =====");
        System.out.println("Kệ số " + shelf + " - Vị trí " + position + " - Khu vực " + area);

        sc.close();
    }
}
