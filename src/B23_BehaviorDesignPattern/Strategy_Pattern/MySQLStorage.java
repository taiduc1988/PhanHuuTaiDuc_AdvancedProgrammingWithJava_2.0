package B23_BehaviorDesignPattern.Strategy_Pattern;

public class MySQLStorage implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("Luu du lieu vào MySql vói user là " + user.getName());
    }
}
