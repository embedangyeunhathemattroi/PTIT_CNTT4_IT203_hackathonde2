import java.util.Scanner;

public class b5 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Khong tim thay duoc ma sach can xoa.");
            return n;
        }

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Đa xoa ma sach: " + bookId);
        return n - 1;
    }

    public static void displayBooks(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Kho sach trong.");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (i == n - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = { 101, 205, 309, 450, 512, 620 };
        int n = books.length;

        while (true) {
            System.out.println("\nDanh sach hien tai:");
            displayBooks(books, n);

            if (n == 0)
                break;

            System.out.print("Nhap ma sach can xoa: ");
            int id = sc.nextInt();

            n = deleteBook(books, n, id);

            System.out.print("Tiep tuc xoa? (y/n): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("\nKet thuc chuong trinh");
    }
}
