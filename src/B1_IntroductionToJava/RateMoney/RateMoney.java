package B1_IntroductionToJava.RateMoney;

import java.util.Scanner;

public class RateMoney {
    public static void main(String[] args) {
        //Khai báo biến rate
        int rate = 23000;
        //Khai báo đối tượng scanner để nhận giá trị người dùng nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your USD: ");
        //gán số usd người dùng nhập vào cho biến usd
        float usd = scanner.nextFloat();
        float vnd = rate * usd;
        System.out.println("Your money VND is: " + vnd + "VND");
    }
}
