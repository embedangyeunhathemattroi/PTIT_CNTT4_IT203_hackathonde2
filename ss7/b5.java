class Config {
    public static final double MAX_SCORE = 10.0;
    public static final double MIN_SCORE = 0.0;
}

public class b5 {
    public static void main(String[] args) {
        double score = 8.5;

        System.out.println("Điểm hiện tại: " + score);
        System.out.println("Điểm tối đa: " + Config.MAX_SCORE);
        System.out.println("Điểm tối thiểu: " + Config.MIN_SCORE);

        if (score > Config.MAX_SCORE) {
            System.out.println("Điểm vượt quá giới hạn!");
        } else if (score < Config.MIN_SCORE) {
            System.out.println("Điểm nhỏ hơn giới hạn!");
        } else {
            System.out.println("Điểm hợp lệ.");
        }
    }
}
