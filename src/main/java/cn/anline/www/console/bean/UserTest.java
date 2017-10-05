package cn.anline.www.console.bean;

public class UserTest {
    String username;
    String password;

    public UserTest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserTest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
