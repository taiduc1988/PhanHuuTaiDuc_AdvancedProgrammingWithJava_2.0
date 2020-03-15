package B11_DSA_Stack_Queue.ReverseByStack;

public class RoundArrayString {
    private String[] arr;
    private int size;
    private int index;

    public RoundArrayString(int size){
        this.size = size;
        arr = new String[size];
    }
    public boolean isFull1(){
        return index == size;
    }
    public boolean isEmpty1(){
        return index == 0;
    }
    public int size(){
        return index;
    }
    public void push(String number){
        if (isFull1())
            System.out.println("Unable! Full");
        arr[index] = number;
        index++;
    }
    public String pop() {
        if (isEmpty1()){
            System.out.println("Stack is null");
        }
        return arr[--index];
    }
    public void show(){
        for (String s: arr) {
            System.out.print(s);
        }
    }
}
