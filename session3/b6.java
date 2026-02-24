public class b6 {
    public static int[] mergeBooks(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (k == 0 || temp[k - 1] != a[i]) {
                    temp[k++] = a[i];
                }
                i++;

            } else if (a[i] > b[j]) {
                if (k == 0 || temp[k - 1] != b[j]) {
                    temp[k++] = b[j];
                }
                j++;

            } else {
                if (k == 0 || temp[k - 1] != a[i]) {
                    temp[k++] = a[i];
                }
                i++;
                j++;
            }
        }
        while (i < a.length) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }
        while (j < b.length) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }
        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = temp[x];
        }

        return result;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arrayFirst = { 101, 120, 150, 200, 250 };
        int[] arraySecond = { 120, 130, 150, 180, 300 };
        System.out.println("Kho A:");
        display(arrayFirst);
        System.out.println("Kho B:");
        display(arraySecond);
        int[] merged = mergeBooks(arrayFirst, arraySecond);
        System.out.println("Kho sau khi gop:");
        display(merged);
    }
}
