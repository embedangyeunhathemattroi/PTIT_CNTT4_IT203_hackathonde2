class Student {
    private String id;
    private String name;
    private static int totalStudent = 0;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        totalStudent++;
    }

    public void display() {
        System.out.println("Mã SV: " + id + " | Tên SV: " + name);
    }

    public static int getTotalStudent() {
        return totalStudent;
    }
}

public class b1 {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "Nguyễn Văn A");
        Student s2 = new Student("SV02", "Trần Văn B");
        Student s3 = new Student("SV03", "Lê Văn C");

        s1.display();
        s2.display();
        s3.display();

        System.out.println("Tổng số sinh viên: " + Student.getTotalStudent());
    }
}
