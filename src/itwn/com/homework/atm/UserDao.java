package itwn.com.homework.atm;

public class UserDao {
    private MyArrayList list=new MyArrayList();

    //检查用户名是否存在 返回用户对象
    public User nameCheck(String name) {
        for (int i = 0; i < list.size(); i++) {
            User temp = (User) list.get(i);
            //User as=(User) new Object();
            if (name.equals(temp.getUserName())) {
                return temp;
            }
        }
        return null;
    }

    //注册
    public boolean register(User user){
        if (nameCheck(user.getUserName())==null){
            list.add(user);
            return true;
        }else {
            return false;
        }
    }
    //查询用户信息
    public void quaryAllUser(){
        if (list.size()==0){
            System.out.println("没有用户");
        }else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
    //修改密码
    public void modify(String pass,User user){
            user.setUserPass(pass);
    }
    //取钱
    public void getMoney(double money,String name){
        User temp=nameCheck(name);
        temp.setMoney(temp.getMoney()-money);

    }
    //存钱
    public void saveMoney(double money,String name){
        User temp=nameCheck(name);
        temp.setMoney(temp.getMoney()+money);

    }
    //转账
    public void transMoney(double money,String name,String transName){
        User temp=nameCheck(name);
        User transtemp=nameCheck(transName);
        temp.setMoney(temp.getMoney()-money);
        transtemp.setMoney(transtemp.getMoney()+money);

    }


}
