public class b3 {
    public static boolean checkPass(double score) {
        if (score >= 5.0) {
            return true;
        }
        return false;
    }

    public static double calculateAverage(double[] scores) {
        double sum = 0;

        for (double s : scores) {
            sum += s;
        }

        return sum / scores.length;
    }
}
