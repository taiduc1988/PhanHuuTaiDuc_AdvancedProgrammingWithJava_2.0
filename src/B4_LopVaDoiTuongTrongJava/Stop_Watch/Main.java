package B4_LopVaDoiTuongTrongJava.Stop_Watch;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        StopWatch stopwatch=new StopWatch();
        stopwatch.start();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else {}
            }
        }
        stopwatch.end();
        System.out.println("Thời gian thực thi thuật toán selection sort 100000 số là : "+stopwatch.getElapsedTime());
    }
}
