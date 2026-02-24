import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of late books: ");
        int n = sc.nextInt();

        long total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter late days of book " + i + ": ");
            int days = sc.nextInt();
            total += days * 5000;
        }

        System.out.println("Total fine: " + total + " VND");

        sc.close();
    }
}
