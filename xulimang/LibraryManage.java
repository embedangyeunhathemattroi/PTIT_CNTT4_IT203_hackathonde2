import java.util.Scanner;

public class LibraryManage {
    // hàm nhập n mã sách và trả về mảng
    public static int[] addBookToLibraries(int n) { // static → thuộc về lớp, không cần tạo đối tượng vẫn dùng được.
        Scanner sc = new Scanner(System.in); // nhập từ bàn phím
        int[] books = new int[n]; // Tạo một mảng số nguyên tên là books,Có n phần tử

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ma sach thu" + (i + 1) + ":");
            books[i] = sc.nextInt(); // nhập số nguyên,Gán vào vị trí thứ i của mảng
        }
        return books;
    }

    // hàm hiển thị danh sách mã sách
    public static void displayLibraries(int[] arr) {
        System.out.println("Danh sách mã sách");
        for (int i = 0; i < arr.length; i++) { // số phần tử của mảng,Không dùng n nữa vì ta đã có mảng rồi
            System.out.print(arr[i]);

        }

    }

    // ham main,yêu cầu người dùng nhập số lượng sách n, gọi hàm nhập và sau đó gọi
    // hàm hiển thị
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach");
        int n = sc.nextInt();// Nhập số lượng sách.
        // Gọi hàm nhập sáchLưu kết quả vào biến bookList
        int[] bookList = addBookToLibraries(n);
        displayLibraries(bookList);// Gọi hàm in danh sách.
    }
}
