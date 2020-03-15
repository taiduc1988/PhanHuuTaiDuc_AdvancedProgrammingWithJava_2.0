package B7_Abstract_Interface.Colorable;

public class Main {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square("red", 3.0,true);
        squares[1] = new Square(2);
        squares[2] = new Square();

        for (Square square: squares) {
            square.howToColor();
            System.out.println(square);
        }
    }
}
