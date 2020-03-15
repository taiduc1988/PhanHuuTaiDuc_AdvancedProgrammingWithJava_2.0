package B11_DSA_Stack_Queue.ReverseByStack;

public class Test {
    public static void main(String[] args) {
        RoundArray array = new RoundArray(3);
        array.push(1);
        array.push(2);
        array.push(3);
        array.show();
        System.out.print("-----------------");
        RoundArray array1 = new RoundArray(3);
        for (int i = 0; i < array.size() + i; i++){
            array1.push(array.pop());
        }
        array1.show();
        System.out.println("----------------");

        RoundArrayString array2 = new RoundArrayString(2);
        array2.push("ab");
        array2.push("cd");
        array2.show();
        System.out.println("----------------");

        RoundArrayString array3 = new RoundArrayString(2);
        for(int i = 0; i < array2.size() + i; i++){
            array3.push(array2.pop());
        }
        array3.show();
    }
}
