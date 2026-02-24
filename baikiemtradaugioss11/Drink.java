public abstract class Drink {
    protected String id;
    protected String name;
    protected double price;

    // Constructor Khởi tạo đầy đủ 3 thuộc tính trên.
    public Drink(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public abstract double calculatePrice();

    // Phương thức thường
    public void displayInfo() {
        System.out.println("mã:" + id);
        System.out.println("tên:" + name);
        System.out.println("giá:" + price);

    }

}
