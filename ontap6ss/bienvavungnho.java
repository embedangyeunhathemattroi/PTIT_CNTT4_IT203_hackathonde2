public class bienvavungnho {
    public static void main(String[] args) {
        System.out.println("Print someting");
        // khai bao va khoi tao gtri cho bien a=21;
        int a = 12;
        // qui tac dat ten bien dung
        String studentName = "Nguyen Van A";
        // kiem tra phai so nguyen to hay ko
        boolean isCheckPrime = false;

        // nhom kieu nguyen thuy: boolean , double, float, byte, short, int ,long,char
        boolean isCheck = true;
        float f = 0.5f;
        double d = 1.5;

        // kieu char
        char c = 'A';
        byte by = 10;
        short sh = 200000;
        int i = 1000000;
        long l = 1111111111111111111111111111111111L;

        // nhom kieu du lieu tham chieu
        int arr[] = { 1, 2, 3, 4 };
        String str = "12345";

        // ngoai ra co class, pbj, interface, enum, annotations

        // hang so k cho thay doi gtri hang so trong chuong trinh
        final float PI = 3.14f;

        // chuyen doi kieu du lieu
        // ep kieu du lieu ngam dinh
        // chuyen tu bien co kich thuoc nho sang lon
        int intValue = sh;// ep kieu du lieu short k sinh ra lỗi và mất dữ liêu
        // ep kieu tuong minh tu bien co kich thuoc lon sang nho
        short shortValue = (short) i;// co the gay mat du lieu

    }
}