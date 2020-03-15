package B3_MangVaPhuongThucTrongJava.Sum_in_Column;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn ma trận có bao nhiêu dòng: ");
        int dong = scanner.nextInt();
        System.out.println("Bạn muốn ma trận có bao nhiêu cột");
        int cot = scanner.nextInt();
        int[][] myArr = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("Nhập giá trị cho phần tử hàng %d cột %d: ", i + 1, j + 1);
                myArr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma Trận đã nhập là: ");
        for (int[] a : myArr) {
            for (int b : a) {
                System.out.print(b + "\t");
            }
            System.out.println();
        }
        int sum = 0;

        System.out.println("Bạn muốn tính tổng của cột thứ: ");
        int index = scanner.nextInt();

        if (index <= myArr[0].length) {
            for (int i = 0; i < dong; i++) {
                for (int j = 0; j < cot; j++) {
                    if (j == index - 1) {
                        sum = sum + myArr[i][j];
                    }
                }
            }

            System.out.printf("Tổng các giá trị của cột %d là: %d", index, sum);
        } else {
            System.out.println("Cột bạn nhập không tồn tại");
        }

    }
}
