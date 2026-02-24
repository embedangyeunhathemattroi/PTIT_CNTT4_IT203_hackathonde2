public class b4 {

    // Sắp xếp Bubble Sort
    public static void sortBooks(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] books = { 105, 210, 98, 450, 123, 76 };

        System.out.println("Truoc khi sap xep:");
        displayBooks(books);

        sortBooks(books);

        System.out.println("Sau khi sap xep:");
        displayBooks(books);
    }
}
