public class HieuHaiMang {
    // • Yêu cầu: Cho hai mảng số nguyên A (n phần tử) và B (m phần tử).
    // 1. Tìm các phần tử xuất hiện trong mảng A nhưng không xuất hiện trong mảng B.
    // 2. Điều kiện: Mỗi giá trị chỉ được in ra một lần duy nhất, không dùng các cấu
    // trúc dữ liệu đặc biệt (Set, Map), không sắp xếp mảng.
    public static void main(String[] args) {
        int[] A = { 1, 2, 2, 4, 6 };
        int[] B = { 2, 3, 5 };
        int n = A.length;
        int m = B.length;

        for (int i = 0; i < n; i++) {
            boolean coTrongB = false;
            for (int j = 0; j < m; j++) {
                if (A[i] == B[j]) {
                    coTrongB = true;
                    break;
                }
            }

            boolean daXuatHien = false;
            for (int k = 0; k < i; k++) {
                if (A[i] == A[k]) {
                    daXuatHien = true;
                    break;
                }
            }

            if (!coTrongB && !daXuatHien) {
                System.out.print(A[i] + " ");
            }
        }
    }
}