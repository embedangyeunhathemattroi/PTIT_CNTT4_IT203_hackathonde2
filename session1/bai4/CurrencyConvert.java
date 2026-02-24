package session1.bai4;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách (USD): ");
        double usdPrice = sc.nextDouble();

        System.out.print("Nhập tỷ giá (VNĐ/USD): ");
        float rate = sc.nextFloat();

        double vnd = usdPrice * rate;

        long vndRounded = (long) vnd;
        System.out.println("\n===== KẾT QUẢ =====");
        System.out.println("Giá USD: " + usdPrice);
        System.out.println("Tỷ giá: " + rate);
        System.out.println("Tổng tiền VNĐ (làm tròn): " + vndRounded + " VND");

        sc.close();
    }
}