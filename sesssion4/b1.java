import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String author = sc.nextLine();

        System.out.print("Nhập thể loại: ");
        String category = sc.nextLine();

        // Chuẩn hóa
        bookName = bookName.trim().replaceAll("\\s+", " ").toUpperCase();
        author = author.trim().replaceAll("\\s+", " ");
        category = category.trim().replaceAll("\\s+", " ");

        // Viết hoa chữ cái đầu mỗi từ của tác giả
        String[] parts = author.split(" ");
        StringBuilder newAuthor = new StringBuilder();
        for (String p : parts) {
            newAuthor.append(Character.toUpperCase(p.charAt(0)))
                    .append(p.substring(1).toLowerCase())
                    .append(" ");
        }

        author = newAuthor.toString().trim();

        // Xuất kết quả
        System.out.println("\nKết quả:");
        System.out.println("[" + bookName + "] - Tác giả: [" + author + "]");
    }
}
