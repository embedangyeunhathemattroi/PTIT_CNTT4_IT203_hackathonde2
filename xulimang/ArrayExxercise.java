import java.util.Scanner;

public class ArrayExxercise {
    public static int insert(int[] arr, int n, int x, int k) { // PHẦN 1: Chèn và dịch chuyển
        for (int i = n; i > k; i--) { // Dịch các phần tử sang phải
            arr[i] = arr[i - 1];
        }
        arr[k] = x;

        return n + 1;
    }

    public static int removeDuplicates(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }

                    n--;
                    j--;
                }
            }
        }
        return n;
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] arr = new int[100];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập giá trị x cần chèn: ");
        int x = sc.nextInt();

        System.out.print("Nhập vị trí k: ");
        int k = sc.nextInt();

        n = insert(arr, n, x, k);

        System.out.println("Mảng sau khi chèn:");
        printArray(arr, n);

        System.out.println("\n--- Xóa phần tử lặp ---");

        System.out.print("Nhập số phần tử m: ");
        int m = sc.nextInt();

        int[] arr2 = new int[100];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        m = removeDuplicates(arr2, m);

        System.out.println("Mảng sau khi loại bỏ trùng:");
        printArray(arr2, m);
    }
}