public class b2 {

    static class Account {
        private String username;
        private String password;
        private String email;

        public Account(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public void changePassword(String newPassword) {
            this.password = newPassword;
            System.out.println("Đổi mật khẩu thành công!");
        }

        public void display() {
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: ******");
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        Account acc1 = new Account("linhpn", "123456", "linh@gmail.com");

        System.out.println("Thông tin ban đầu:");
        acc1.display();

        acc1.changePassword("abcdef");

        System.out.println("Sau khi đổi mật khẩu:");
        acc1.display();
    }
}
