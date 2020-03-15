package B3_MangVaPhuongThucTrongJava.InputArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);


        int newSize = size*2;
        array = new int[newSize];


        int i = 0;
        while (i < size) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        for (;size<newSize;size++){
            array[size] = 0;
        }

        for (int k = 0; k < size; k++) {
            System.out.print(array[k] + "\t");
        }

        int index;
        System.out.println("\t" + "Nhap vị trí");
        index = scanner.nextInt();
        int value;
        System.out.println("nhap giá trị");
        value = scanner.nextInt();

        array[index-1] = value;

        for (int k = 0; k < size; k++) {
            System.out.print(array[k] + "\t");
        }
    }
}
