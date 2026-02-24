public class b5 {

    static class Book {
        private String id;
        private String title;
        private double price;

        public Book(String id, String title, double price) {
            this.id = id;
            this.title = title;
            this.price = price;
        }

        public void display() {
            System.out.println("Mã sách: " + id);
            System.out.println("Tên sách: " + title);
            System.out.println("Giá: " + price);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        Book b1 = new Book("B01", "Java Cơ Bản", 85000);
        Book b2 = new Book("B02", "OOP Với Java", 120000);

        b1.display();
        b2.display();
    }
}
