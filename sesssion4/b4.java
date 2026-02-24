import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã thẻ thư viện: ");
        String card = sc.nextLine();

        // Regex tổng
        String regex = "^[A-Z]{2}\\d{4}\\d{5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(card);

        if (matcher.matches()) {
            System.out.println(" Mã thẻ hợp lệ");
        } else {
            // Thông báo lỗi chi tiết
            if (!card.matches("^[A-Z]{2}.*")) {
                System.out.println(" Thiếu hoặc sai tiền tố 2 chữ hoa (VD: TV)");
            } else if (!card.matches("^[A-Z]{2}\\d{4}.*")) {
                System.out.println(" nam khong hop lệ");
            } else if (!card.matches("^[A-Z]{2}\\d{4}\\d{5}$")) {
                System.out.println(" Phải có đúng 5 số ở cuối");
            } else {
                System.out.println(" dinh dang khong hop le");
            }
        }
    }
}
