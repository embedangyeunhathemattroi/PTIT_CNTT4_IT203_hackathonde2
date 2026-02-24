import java.util.Scanner;

public class StringExercise {
    // Viết hoa chữ cái đầu mỗi từ
    public static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase()
                + word.substring(1).toLowerCase();
    }

    // Phần 1: Trích xuất & Chuẩn hóa
    public static void extractAndNormalize(String input) {

        input = input.replaceAll("[^a-zA-Z]", " ")
                .trim()
                .replaceAll("\\s+", " ");

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(capitalize(word)).append(" ");
            }
        }

        System.out.println("Chuỗi chuẩn hóa: " + result.toString().trim());
    }

    // Phần 2: Ký tự xuất hiện đúng 1 lần
    public static void uniqueCharacters(String input) {
        System.out.print("Ký tự xuất hiện đúng 1 lần: ");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == ch) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(ch + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi hỗn hợp: ");
        extractAndNormalize(sc.nextLine());
        System.out.print("\nNhập chuỗi để thống kê: ");
        uniqueCharacters(sc.nextLine());

        sc.close();
    }
}