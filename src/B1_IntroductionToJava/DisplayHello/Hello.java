package B1_IntroductionToJava.DisplayHello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        //Khai báo đối tượng scanner để nhận dữ liệu người dùng nhập vào
        Scanner scanner = new Scanner(System.in);

        //In ra thông báo yêu cầu người dùng nhập tên
        System.out.println("Input Your Name Please: ");

        //Nhận giá trị người dùng nhập vào và gán giá trị cho biến name kiểu String
        String name = scanner.nextLine();
        System.out.println("===============================================");

        //In câu chào hello kèm theo biến name mà người dùng đã nhập
        System.out.println("Hello " + name);
    }
}

