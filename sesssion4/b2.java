import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mô tả sách: ");
        String desc = sc.nextLine();

        if (desc.contains("Kệ:")) {
            int start = desc.indexOf("Kệ:") + 3;

            while (start < desc.length() && desc.charAt(start) == ' ') {
                start++;
            }

            int end = desc.indexOf(",", start);
            if (end == -1) {
                end = desc.length();
            }

            String maKe = desc.substring(start, end);

            String newDesc = desc.replace("Kệ:", "Vị trí lưu trữ:");

            System.out.println("\n Mã vị trí: " + maKe);
            System.out.println(" Mô tả mới: " + newDesc);
        } else {
            System.out.println(" Không tìm thấy thông tin kệ sách.");
        }
    }
}
