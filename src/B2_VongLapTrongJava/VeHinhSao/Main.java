package B2_VongLapTrongJava.VeHinhSao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Vẽ hình chữ nhật
        int height;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("height = ");
            height = sc.nextInt();
        }while(height <= 0);

        for (int i = 0; i < height; i++){
            for (int j = 0 ; j < 7; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //In hình tam giác vuông, có cạnh góc vuông ở botton-left
        System.out.println(" ");
        System.out.println("=================================================");
        for (int i = 0; i <height; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //In hình tam giác vuông, có cạnh góc vuông ở top-left
        System.out.println(" ");
        System.out.println("=================================================");
        for (int i = 0; i <height; i++){
            for (int j = 5; j > i; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //In hình tam giác cân
        for(int i = 1; i <= height; i++) {
            for(int j = 1; j <= height-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
