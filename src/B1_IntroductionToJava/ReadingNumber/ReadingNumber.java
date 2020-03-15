package B1_IntroductionToJava.ReadingNumber;

import java.util.Scanner;

public class ReadingNumber {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner= new Scanner(System.in);
        //Nhập số cần đổi thành chữ
        int num=scanner.nextInt();
        String text="";
        //Nếu số nhỏ hơn 1000
        if (num<1000){
            //Lấy đơn vị hàng trăm của số đã nhập
            int unitHundred=num/100;
            //Lấy đơn vị hàng chục của số đã nhập
            int unitTen=num/10%10;
            //lấy đơn vị hàng đơn vị của số đã nhập
            int unit=num%100%10;
            //Chuyển đơn vị hàng trăm thành chữ
            if(unitHundred!=0){
                switch (unitHundred){
                    case 1:
                        text+= "One";
                        break;
                    case 2:
                        text+= "Two";
                        break;
                    case 3:
                        text+= "Three";
                        break;
                    case 4:
                        text+= "Four";
                        break;
                    case 5:
                        text+= "Five";
                        break;
                    case 6:
                        text+= "Six";
                        break;
                    case 7:
                        text+= "Seven";
                        break;
                    case 8:
                        text+= "Eight";
                        break;
                    case 9:
                        text+= "Nine";
                        break;
                }
                //Nối thêm chữ hundresds phía sau
                text+=" hundreds ";
            }
            //chuyển đơn vị hàng chục
            if (unitTen==1){
                switch (unit){
                    case 0:
                        text+= "and ten";
                        break;
                    case 1:
                        text+= "and eleven";
                        break;
                    case 2:
                        text+= "and twelve";
                        break;
                    case 3:
                        text+= "and thirteen";
                        break;
                    case 4:
                        text+= "and fourteen";
                        break;
                    case 5:
                        text+= "and fifteen";
                        break;
                    case 6:
                        text+= "and sixteen";
                        break;
                    case 7:
                        text+= "and seventeen";
                        break;
                    case 8:
                        text+= "and eighteen";
                        break;
                    case 9:
                        text+= "and nineteen";
                        break;
                }
            }else {
                if(unitTen!=0){
                    switch (unitTen){
                        case 2:
                            text+= "twen";
                            break;
                        case 3:
                            text+= "thir";
                            break;
                        case 4:
                            text+= "for";
                            break;
                        case 5:
                            text+= "fif";
                            break;
                        case 6:
                            text+= "six";
                            break;
                        case 7:
                            text+= "seven";
                            break;
                        case 8:
                            text+= "eight";
                            break;
                        case 9:
                            text+= "nine";
                            break;
                    }
                    text+="ty ";
                }
                //Chuyển đơn vị
                switch (unit){
                    case 1:
                        text+= "one";
                        break;
                    case 2:
                        text+= "two";
                        break;
                    case 3:
                        text+= "three";
                        break;
                    case 4:
                        text+= "four";
                        break;
                    case 5:
                        text+= "five";
                        break;
                    case 6:
                        text+= "six";
                        break;
                    case 7:
                        text+= "seven";
                        break;
                    case 8:
                        text+= "eight";
                        break;
                    case 9:
                        text+= "nine";
                        break;
                }
            }
        }else {
            System.out.println("out of ability");
        }
        System.out.printf("%s",text);
    }
}
