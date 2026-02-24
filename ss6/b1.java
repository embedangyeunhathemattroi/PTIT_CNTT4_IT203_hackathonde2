public class b1 {
    static class Student {
        private String id;
        private String name;
        private int birthYear;
        private double gpa;

        // Constructor
        public Student(String id, String name, int birthYear, double gpa) {
            this.id = id;
            this.name = name;
            this.birthYear = birthYear;
            this.gpa = gpa;
        }

        // Method hiển thị
        public void display() {
            System.out.println("Mã SV: " + id);
            System.out.println("Họ tên: " + name);
            System.out.println("Năm sinh: " + birthYear);
            System.out.println("Điểm TB: " + gpa);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("SV01", "Nguyễn Văn A", 2004, 8.6);
        Student s2 = new Student("SV02", "Trần Thị B", 2003, 7.9);

        s1.display();
        s2.display();
    }
}
