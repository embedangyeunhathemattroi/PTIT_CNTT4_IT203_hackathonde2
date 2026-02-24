class ClassRoom {
    private static double classFund = 0;
    private String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void pay(double amount) {
        classFund += amount;
        System.out.println(studentName + " đóng: " + amount);
    }

    public static void showFund() {
        System.out.println("Tổng quỹ lớp: " + classFund);
    }
}

public class b4 {
    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("An");
        ClassRoom s2 = new ClassRoom("Bình");
        ClassRoom s3 = new ClassRoom("Chi");

        s1.pay(100);
        s2.pay(150);
        s3.pay(200);

        ClassRoom.showFund();
    }
}
