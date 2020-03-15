package B10_DSA_DanhSach.ArrayList;

public class TestMyArrayList {
    static class Person{
        String name;
        int Age;

        Person(String name, int age) {
            this.name = name;
            Age = age;
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person("Trung", 33);
        Person p2 = new Person("Hai", 22);
        Person p3 = new Person("Kien", 24);
        MyArrayList<Person> list = new MyArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        if (list.contains(p3)){
            System.out.println("p2 co trong list");
        }
//        list.clear();
        for (int i = 0; i < list.length(); i ++){
            if (list.get(i) != null){
                Person p = list.get(i);
                System.out.println(p.name);
            }else {
                System.out.println("null");
            }


        }
    }
}
