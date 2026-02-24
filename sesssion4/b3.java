import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class b3 {

    public static void main(String[] args) {
        int n = 50000;

        List<String> logs = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            logs.add("BOOK" + i + " - 2026-01-28");
        }

        long start1 = System.nanoTime();

        String report1 = "Thời gian: " + LocalDateTime.now() + "\n";
        for (String s : logs) {
            report1 += s + "\n";
        }

        long end1 = System.nanoTime();
        long timeString = end1 - start1;

        long start2 = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        sb.append("Thời gian: ").append(LocalDateTime.now()).append("\n");

        for (String s : logs) {
            sb.append(s).append("\n");
        }

        String report2 = sb.toString();

        long end2 = System.nanoTime();
        long timeBuilder = end2 - start2;

        System.out.println("===== SO SÁNH HIỆU NĂNG =====");
        System.out.println("String +       : " + timeString + " ns");
        System.out.println("StringBuilder  : " + timeBuilder + " ns");

        System.out.println("\n===== MẪU BÁO CÁO =====");
        System.out.println(report2.substring(0, 200) + "...");
    }
}
