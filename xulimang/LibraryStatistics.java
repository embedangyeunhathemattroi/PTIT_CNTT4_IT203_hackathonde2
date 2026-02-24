public class LibraryStatistics {
    // Viết phương thức maxQuantityOfBooks(String[] names, int[] quantities):
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        // tim gia tri lon nhat
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];

            }
        }
        // In ra tên và số lượng của cuốn sách có số lượng lớn nhat
        System.out.println("Sach co so luong lon nhat la ");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("-" + names[i] + "(" + quantities[i] + ")");
            }
        }

    }

    // Viết phương thức minQuantityOfBooks(String[] names, int[] quantities)
    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        // tim gia tri lon nhat
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];

            }
        }
        // In ra tên và số lượng của cuốn sách có số lượng nho nhat
        System.out.println("Sach co so luong lon nhat la ");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("-" + names[i] + "(" + quantities[i] + ")");
            }
        }

    }

    public static void main(String[] args) {
        // Khởi tạo 2 mảng có cùng kích thước (ví dụ 5 phần tử)
        String[] names = {
                "dac nhan tam", "nha gia Kim", "doremon", "de men", "anime"
        };
        int[] quantities = { 10, 20, 30, 40, 50 };

        maxQuantityOfBooks(names, quantities);
        System.out.println();
        minQuantityOfBooks(names, quantities);
    }

    // Đảm bảo chương trình hoạt động đúng kể cả khi có nhiều sách có cùng số lượng
    // lớn nhất/nhỏ nhất (in tất cả chúng ra)

}
