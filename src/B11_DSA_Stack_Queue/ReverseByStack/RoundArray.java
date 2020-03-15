package B11_DSA_Stack_Queue.ReverseByStack;

public class RoundArray {
    private int[] arr;
    private int size;
    private int index;

    public RoundArray(int size){
        this.size = size;
        arr = new int[size];
    }
    public boolean isFull(){
        return index == size;
    }
    public boolean isEmpty(){
        return index == 0;
    }
    public int size(){
        return index;
    }
    public void push(int number){
        if (isFull())
            System.out.println("Unable! Full");
        arr[index] = number;
        index++;
    }
    public int pop() {
        if (isEmpty()){
            System.out.println("Stack is null");
        }
        return arr[--index];
    }
    public void show(){
        for (int s: arr) {
            System.out.print(s);
        }
    }
}
