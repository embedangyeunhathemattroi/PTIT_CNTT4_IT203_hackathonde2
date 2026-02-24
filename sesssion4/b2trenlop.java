import java.util.Scanner;

public class b2trenlop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số điện thoại: ");
        String phone = sc.nextLine();
        String regex = "^0[9142]\\d{8,9}$";

        if (phone.matches(regex)) {
            System.out.print("Nhập số điện thoại hop le ");
        } else {
            System.out.print("Nhập số điện thoại khong hop le ");

        }
    }

}
// sdung pattern