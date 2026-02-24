public class b6 {

    static class User {
        private String id;
        private String username;
        private String password;
        private String email;

        public User(String id, String username, String password, String email) {
            this.id = id;
            this.username = username;
            setPassword(password);
            setEmail(email);
        }

        public String getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            if (password != null && !password.trim().isEmpty()) {
                this.password = password;
            } else {
                System.out.println("Password không được rỗng!");
            }
        }

        public void setEmail(String email) {
            if (email != null && email.contains("@") && email.contains(".")) {
                this.email = email;
            } else {
                System.out.println("Email không hợp lệ!");
            }
        }

        public void display() {
            System.out.println("ID: " + id);
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: ******");
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        User u1 = new User("U01", "linhpham", "123456", "linh@gmail.com");
        User u2 = new User("U02", "user02", "abcdef", "saiemail");
        User u3 = new User("U03", "user03", "", "user03@mail.com");

        u1.display();
        u2.display();
        u3.display();
        System.out.println("Thử cập nhật dữ liệu sai:");
        u1.setEmail("abc");
        u1.setPassword("");

        System.out.println("Cập nhật đúng:");
        u1.setEmail("newmail@gmail.com");
        u1.setPassword("newpass123");

        u1.display();
    }
}
