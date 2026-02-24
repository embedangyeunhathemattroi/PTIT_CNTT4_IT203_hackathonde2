import java.util.Scanner;

public class b2 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {
                "Java Core",
                "Lap Trinh C",
                "Python Basics",
                "OOP Java",
                "Data Structure"
        };

        System.out.print("NNhap ten sach can tim: ");
        String key = sc.nextLine();
        int pos = searchBooks(books, key);
        if (pos != -1) {
            System.out.println("Tim thay tai vi tri " + pos);
        } else {
            System.out.println("sach ko ton tai");
        }
    }
}
