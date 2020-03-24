package B18_Threading.DisplayOddEven;

public class TestThread {
    public static void main(String[] args){
        OddThread oddThread = new OddThread();
        Thread thread2 = new Thread(oddThread);
        EvenThread evenThread = new EvenThread();
        Thread thread1 = new Thread(evenThread);

        thread2.start();

        try {
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thread1.start();
    }
}
