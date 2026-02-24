import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 100;
        int days;

        System.out.println("Enter late days (999 to exit):");

        while (true) {
            System.out.print("Input: ");
            days = sc.nextInt();

            if (days == 999) {
                break;
            }

            if (days <= 0) {
                score += 5;
            } else {
                score -= days * 2;
            }
        }

        System.out.println("Final score: " + score);

        if (score > 120) {
            System.out.println("Độc giả Thân thiết");
        } else if (score >= 80) {
            System.out.println("Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Độc giả cần lưu ý");
        }

        sc.close();
    }
}
