import java.util.Scanner;

public class NormalizeBookInfo {

    public static String capitalizeWords(String str) {

        str = str.toLowerCase();
        String[] words = str.split("");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                // ham viet hoa chu cai dau moi tu
                String word = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
                result += word + "";

            }

        }

        return result.trim();

    }

    // Nhập vào tên sách, tác giả và thể loại
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach");
        String title = sc.nextLine();

        System.out.print("Nhap ten tac gia");
        String author = sc.nextLine();

        System.out.print("Nhap ten the loai");
        String category = sc.nextLine();
        // Loại bỏ khoảng trắng thừa ở hai đầu và giữa các từ
        title = title.trim().replaceAll("\\s", "");
        author = author.trim().replaceAll("\\s", "");
        category = category.trim().replaceAll("\\s", "");
        // Định dạng lại: Tên sách viết hoa toàn bộ
        title = title.toUpperCase();
        // Tên tác giả viết hoa chữ cái đầu mỗi từ
        author = capitalizeWords(category);
        // Xuấtt ra chuỗi tổng hợp: [TÊN SÁCH] - Tác giả: [Tên Tác Giả]
        System.out.println(title + "|" + author + "|" + category);

    }

}
