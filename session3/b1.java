import java.util.Scanner;

public class b1 {

    // Nhập danh sách mã sách
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã sách thứ " + (i + 1) + ": ");
            books[i] = sc.nextInt();
        }

        return books;
    }

    // Hiển thị danh sách mã sách
    public static void displayLibraries(int[] arr) {
        System.out.println("\nDanh sach ma sach:");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach: ");
        int n = sc.nextInt();

        int[] libraries = addBookToLibraries(n);
        displayLibraries(libraries);
    }
}
