import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b6 {

    public static void main(String[] args) {

        String review = "Cuốn sách này rất hay nhưng có vài đoạn thật ngu ngốc và tệ hại. "
                + "Nội dung đôi lúc làm tôi cảm thấy bực mình, nhưng tổng thể thì vẫn đáng đọc cho sinh viên CNTT.";

        // 1. Blacklist
        String[] blacklist = { "ngu", "tệ", "bực" };

        // 2. Tạo regex
        StringBuilder regexBuilder = new StringBuilder("(?i)\\b(");
        for (int i = 0; i < blacklist.length; i++) {
            regexBuilder.append(blacklist[i]);
            if (i < blacklist.length - 1) {
                regexBuilder.append("|");
            }
        }
        regexBuilder.append(")\\b");

        Pattern pattern = Pattern.compile(regexBuilder.toString());
        Matcher matcher = pattern.matcher(review);

        StringBuilder filtered = new StringBuilder();

        while (matcher.find()) {
            String word = matcher.group();
            String stars = "*".repeat(word.length());
            matcher.appendReplacement(filtered, stars);
        }
        matcher.appendTail(filtered);

        String result = filtered.toString();

        int MAX = 200;
        if (result.length() > MAX) {
            int cutPos = result.lastIndexOf(" ", MAX);
            if (cutPos == -1) {
                cutPos = MAX;
            }

            StringBuilder shortText = new StringBuilder();
            shortText.append(result.substring(0, cutPos));
            shortText.append("...");

            result = shortText.toString();
        }

        // 5. Kết quả
        System.out.println("===== ĐÁNH GIÁ SAU LỌC =====");
        System.out.println(result);
    }
}
