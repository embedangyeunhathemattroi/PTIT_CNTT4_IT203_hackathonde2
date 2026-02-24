import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter number of borrowed books: ");
        int books = sc.nextInt();

        if (age >= 18 && books < 3) {
            System.out.println("Cho phep muon sach");
        } else {
            if (age < 18) {
                System.out.println("Bạn chưa đủ tuổi");
            }
            if (books >= 3) {
                System.out.println("Bạn đã mượn quá số lượng cho phép");
            }
        }

        sc.close();
    }
}
