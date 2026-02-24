public class SortBooks {
    // Viết phương thức sortBooks(int[] arr): Sử dụng thuật toán Sắp xếp nổi bọt
    public static void sortBooks(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length + 1; j = j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }

    }

    // (Bubble Sort) hoặc Đổi chỗ trực tiếp (Interchange Sort) để sắp xếp mảng
    // Viết phương thức displayBooks(int[] arr) để in mảng sau khi sắp xếp
    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();

    }

    // Trong main, in mảng trước khi sắp xếp, gọi hàm sắp xếp và in lại kết quả
    public static void main(String[] args) {
        // khởi tạo mảng ngẫu nhiên,
        int[] books = { 10, 20, 30, 40, 50 };
        System.out.println("Mang truoc khi dc sap xep");
        displayBooks(books);
        sortBooks(books);
        System.out.println("Mang sau khi dc sap xep");
        displayBooks(books);

    }
}
