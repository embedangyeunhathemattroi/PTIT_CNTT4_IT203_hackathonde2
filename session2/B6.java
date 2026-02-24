import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter borrow count for day " + i + ": ");
            int borrow = sc.nextInt();

            if (borrow == 0) {
                continue;
            }

            if (borrow > max) {
                max = borrow;
            }

            if (borrow < min) {
                min = borrow;
            }

            sum += borrow;
            count++;
        }

        if (count > 0) {
            double avg = (double) sum / count;

            System.out.println("Max borrow: " + max);
            System.out.println("Min borrow: " + min);
            System.out.println("Average borrow: " + avg);
        } else {
            System.out.println("No valid data to analyze");
        }

        sc.close();
    }
}
