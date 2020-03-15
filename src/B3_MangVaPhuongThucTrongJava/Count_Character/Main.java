package B3_MangVaPhuongThucTrongJava.Count_Character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi của bạn: ");
        String str = scanner.nextLine();

        System.out.println("Nhập ký tự muốn đếm");
        char ch = scanner.nextLine().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }

        System.out.println("Số lượng ký tự '" + ch + "' trong chuỗi '" + str + "' là: " + count);
    }
}
