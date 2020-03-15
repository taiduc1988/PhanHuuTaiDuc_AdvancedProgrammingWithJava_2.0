package B23_BehaviorDesignPattern.Strategy_Pattern;

public class XMLStorage implements UserStorage{

    @Override
    public void store(User user) {
        System.out.println("Luu du lieu vào XMLStore vói User là : " + user.getName());
    }
}
