import java.util.Scanner;

public class LibrarySearch {
    // Khai báo và khởi tạo sẵn một mảng String[] books chứa tên của ít nhất 5 cuốn

    // 1, ham tim kiem tuyen tinh
    // Viết phương thức searchBooks(String[] arr, String search): Trả về vị trí
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            // equals() so sanh noi dung chuoi
            // (index) của cuốn sách nếu tìm thấy, hoặc trả về -1 nếu không tìm thấy
            if (arr[i].equalsIgnoreCase(search)) {
                return i;

            }
        }

        return -1;// ko thay

    }

    public static void main(String[] args) {
        // Trong main, cho người dùng nhập tên sách cần tìm, gọi phương thức và in ra
        Scanner sc = new Scanner(System.in);
        String[] books = {
                "dac nhan tam", "nha gia Kim", "doremon", "de men", "anime"
        };

        System.out.println("Nhap ten sach can tim");
        String search = sc.nextLine();

        // kết quả: "Tìm thấy tại vị trí X" hoặc "Sách không tồn tại"
        int result = searchBooks(books, search);
        if (result != -1) {
            System.out.println("TIm thay sach tai vi tri" + result);

        } else {
            System.out.println("Sach khong ton tai !");
        }

    }

}
