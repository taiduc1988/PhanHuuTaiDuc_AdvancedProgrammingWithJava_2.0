package B3_MangVaPhuongThucTrongJava.DuongCheoMaTranVuong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của ma trân vuông");
        int size = scanner.nextInt();
        int sum = 0;
        int[][] myArr = new int[size][size];
        for (int i = 0; i<size;i++ ){
            for (int j = 0; j < size; j++){
                System.out.printf("Nhập giá trị cho phần tử hàng %d cột %d: ", i+1, j+1 );
                myArr[i][j] = scanner.nextInt();
            }
        }



        for (int i = 0; i<size;i++ ){
            for (int j = 0; j < size; j++){
                if (i == j){
                    sum = sum + myArr[i][i];
                }
            }
        }

        System.out.println("Tổng giá trị của các phần tử trong đường chéo chính là: " + sum);


    }
}
