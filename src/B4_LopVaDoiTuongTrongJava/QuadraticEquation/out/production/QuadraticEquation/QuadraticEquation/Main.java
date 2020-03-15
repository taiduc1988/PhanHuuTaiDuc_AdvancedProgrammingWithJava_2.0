package B4_LopVaDoiTuongTrongJava.QuadraticEquation.out.production.QuadraticEquation.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a của phương trình bậc 2: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b của phương trình bậc 2: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c của phương trình bậc 2: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("Nghiệm thứ nhất là: " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm thứ hai là: " + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("Phương trình có nghiệm kép là: " + (-b/(2*a)));
        }else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
