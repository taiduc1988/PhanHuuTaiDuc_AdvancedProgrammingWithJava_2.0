package B12_JavaCollectionFramework.ArrayList_LinkedList;

public class MainTest {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        manager.add(3,"Trung",21);
        manager.add(1,"Hùng",25);
        manager.add(5,"Dũng",26);
        manager.add(6,"Kiên",15);
        manager.add(7,"Cường",15);
        manager.showAll();
        manager.sortListByName();
        manager.showAll();
    }
}
