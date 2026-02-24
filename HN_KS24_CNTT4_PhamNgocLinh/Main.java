import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== QUAN LY DIEM SINH VIEN =====");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo hoc luc");
            System.out.println("4. Sap xep theo hoc luc giam dan");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> nhapDanhSach();
                case 2 -> hienThi();
                case 3 -> timTheoHocLuc();
                case 4 -> sapXep();
                case 5 -> System.out.println("Đa thoat!");
                default -> System.out.println("Chon sai!");
            }
        } while (choice != 5);
    }

    static void nhapDanhSach() {
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nSinh vien " + (i + 1));

            String id;
            while (true) {
                System.out.print("Nhap ID (SVxxx): ");
                id = sc.nextLine();
                if (id.matches("SV\\d{3}"))
                    break;
                System.out.println("Sai đinh dang!");
            }

            System.out.print("Nhap ten: ");
            String name = sc.nextLine();

            System.out.print("Nhap điem: ");
            double score = Double.parseDouble(sc.nextLine());

            list.add(new Student(id, name, score));
        }
    }

    static void hienThi() {
        if (list.isEmpty()) {
            System.out.println("Danh sách rong!");
            return;
        }
        for (Student s : list) {
            System.out.println(s);
        }
    }

    static void timTheoHocLuc() {
        System.out.print("Nhap hoc luc can tim: ");
        String key = sc.nextLine();

        boolean found = false;
        for (Student s : list) {
            if (s.getRank().equalsIgnoreCase(key)) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found)
            System.out.println("Khong tim thay!");
    }

    static void sapXep() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getScore() < list.get(j).getScore()) {
                    Student temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("Đa sap xep xong!");
    }
}
