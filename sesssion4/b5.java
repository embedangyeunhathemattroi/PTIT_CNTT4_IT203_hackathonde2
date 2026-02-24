import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b5 {

    public static void main(String[] args) {
        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: TranThiB | Action: RETURN | BookID: BK12345",
                "2024-05-22 | User: LeVanC | Action: BORROW | BookID: BK88888",
                "2024-05-23 | User: PhamMinhD | Action: BORROW | BookID: BK77777"
        };

        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: ([A-Za-z0-9_]+) \\| Action: ([A-Z]+) \\| BookID: ([A-Za-z0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        System.out.println("===== TRÍCH XUẤT LOG =====");

        for (String line : logs) {
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);

                System.out.println("Ngày: " + date);
                System.out.println("User: " + user);
                System.out.println("Action: " + action);
                System.out.println("BookID: " + bookId);
                System.out.println("----------------------");

                if (action.equals("BORROW")) {
                    borrowCount++;
                } else if (action.equals("RETURN")) {
                    returnCount++;
                }
            }
        }

        System.out.println("===== THỐNG KÊ =====");
        System.out.println("Số lần BORROW: " + borrowCount);
        System.out.println("Số lần RETURN: " + returnCount);
    }
}
