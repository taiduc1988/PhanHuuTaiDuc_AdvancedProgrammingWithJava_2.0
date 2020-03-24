package B3_MangVaPhuongThucTrongJava.Max_in_Array_2D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] myArray = new int[2][2];
        for (int i = 0; i < 2; i ++){
            for (int j = 0; j < 2; j ++){
                System.out.println("nhập giá trị cho phần tử hàng " + (i +1) +" cột " + (j +1));
                myArray[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều đã nhập là: ");
        for (int i = 0; i < 2; i ++){
            for (int j = 0; j < 2; j ++){
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }

        int max = myArray[0][0];
        for (int i = 0; i < 2; i ++) {
            for (int j = 0; j < 2; j++) {
                if (max < myArray[i][j]){
                    max = myArray[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
