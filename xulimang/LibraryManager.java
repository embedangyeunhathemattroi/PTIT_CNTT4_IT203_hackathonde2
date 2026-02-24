import java.util.Scanner;

public class LibraryManager {
    static final int MAX = 100;
    static int[] ids = new int[MAX];
    static int[] quantities = new int[MAX];
    static String[] titles = new String[MAX];

    // so sach hien co
    static int count = 0;
    static Scanner sc = new Scanner(System.in);// nhap tu ban phim

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== MENU QUẢN LÝ THƯ VIỆN =====");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm sách mới");
            System.out.println("3. Cập nhật số lượng");
            System.out.println("4. Xóa sách");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Sắp xếp theo số lượng (giảm dần)");
            System.out.println("0. Thoát");

            System.out.println("chon");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    viewBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    updateQuantity();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    searchBook();
                    break;
                case 6:
                    sortByQuantity();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }

    public static void viewBooks() {
        if (count == 0) {
            System.out.println("Danh sach rong");
            return;

        }

        System.out.println("ma/ten/so luong");
        for (int i = 0; i < count; i++) {
            System.out.println(ids[i] + " | " + titles[i] + " | " + quantities[i]);
        }

    }

    public static void addBook() {
        if (count == MAX) {
            System.out.println("Danh sach da day");
            return;

        }
        System.out.println("Nhap ma sach");
        int id = sc.nextInt();
        sc.nextLine();
        // kiem tra ma trung
        for (int i = 0; i < count; i++) {
            if (ids[i] == id) {
                System.out.println("Ma sach da ton tai");
                return;

            }
        }

        System.out.println("Nhap tieu de sach");
        String title = sc.nextLine();

        System.out.println("Nhap so luong sach");
        int quantity = sc.nextInt();
        ids[count] = id;
        titles[count] = title;
        quantities[count] = quantity;

        count++;
        System.out.println("Them thanh cong");
    }

    public static void updateQuantity() {
        System.out.println("Nhap ma sach can nhap");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (ids[i] == id) {
                System.out.println("Nhap so luong moi");
                quantities[i] = sc.nextInt();
                System.out.println("Cap nhat thanh cong");
                return;
            }
        }
        System.out.println("Ko thay sach");

    }

    public static void deleteBook() {
        System.out.println("Nhap ma sach can xoa");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (ids[i] == id) {
                // don mang
                for (int j = 0; j < count - 1; j++) {
                    ids[j] = ids[j + 1];
                    titles[j] = titles[j + 1];
                    quantities[j] = quantities[j + 1];

                }
                count--;
                System.out.println("Xoa thanh cong");
                return;
            }
        }
        System.out.println("Ko tim thay sach nao ");

    }

    public static void searchBook() {
        sc.nextLine();
        System.out.println("Nhap ma sach can tim kiem");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (titles[i].toLowerCase().contains(keyword)) {
                System.out.println(ids[i] + "!" + titles[i] + "!" + quantities[i]);
                found = true;

            }

        }
        if (!found) {
            System.out.println("KO tim thay");

        }

    }

    public static void sortByQuantity() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                // doi quantities
                int tempQ = quantities[i];
                quantities[i] = quantities[j];
                quantities[j] = tempQ;

                // doi ids
                int tempId = ids[i];
                ids[i] = ids[j];
                ids[j] = tempId;

                // doi title
                String tempT = titles[i];
                titles[i] = titles[j];
                titles[j] = tempT;

            }

        }
        System.out.println("Da xep dung theo so luong giam dan");

    }

}
