package itwn.com.homework.atm;

public class User {
    private int id;//自增
    private String userName;
    private String userPass;
    private String userPhone;
    private double money;
    private static int count;

    public User(){}
    public User(String userName, String userPass, String userPhone, double money) {
        this.id=++count;
        this.userName = userName;
        this.userPass = userPass;
        this.userPhone = userPhone;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id:" + id +
                ", 用户名：'" + userName + '\'' +
                ", 密码：'" + userPass + '\'' +
                ", 手机号：'" + userPhone + '\'' +
                ", 存款：" + money +"元"+
                '}';
    }
}
