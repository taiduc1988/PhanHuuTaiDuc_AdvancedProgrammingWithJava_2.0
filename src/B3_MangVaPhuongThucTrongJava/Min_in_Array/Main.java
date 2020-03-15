package B3_MangVaPhuongThucTrongJava.Min_in_Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            System.out.printf("Nhập giá trị thứ %d cho mảng: ", i+1);
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }

        System.out.printf("Phần tử nhỏ nhất của mảng là: %d", min);
    }
}
