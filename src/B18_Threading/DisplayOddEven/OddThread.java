package B18_Threading.DisplayOddEven;

public class OddThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i % 2 != 0) {
                System.out.println("OddNumber: " + i);
            }
        }
    }
}
