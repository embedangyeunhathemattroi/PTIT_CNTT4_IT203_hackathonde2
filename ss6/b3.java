public class b3 {
    static class Product {
        private String productId;
        private String productName;
        private double price;

        public Product(String productId, String productName, double price) {
            this.productId = productId;
            this.productName = productName;
            setPrice(price);
        }

        public String getProductId() {
            return productId;
        }

        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            } else {
                System.out.println("Giá không hợp lệ! Giá phải > 0");
            }
        }

        public void display() {
            System.out.println("Mã SP: " + productId);
            System.out.println("Tên SP: " + productName);
            System.out.println("Giá bán: " + price);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        Product p = new Product("P01", "Laptop Dell", 15000000);
        p.display();
        System.out.println("Thử set giá = -5000");
        p.setPrice(-5000);
        p.display();
        System.out.println("Set giá = 18000000");
        p.setPrice(18000000);

        p.display();
    }
}
