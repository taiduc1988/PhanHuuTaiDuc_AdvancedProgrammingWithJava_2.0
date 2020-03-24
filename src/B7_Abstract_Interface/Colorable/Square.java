package B7_Abstract_Interface.Colorable;

public class Square implements Colorable {
    private boolean colorable;
    public double side;
    public  String color;

    public double getSide(){
        return  side;
    }
    public void setSide(double side){
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isColorable() {
        return colorable;
    }

    public void setColorable(boolean colorable) {
        this.colorable = colorable;
    }

    public double getArea(){
        return side*4;
    }

    public Square(){

    }
    public Square(double side){
        this.side = side;
    }
    public Square ( String color, double side, boolean colorable){

        this.color = color;
        this.side = side;
        this.colorable = colorable;
    }
    public  String toString(){
        return "the area is: " + getArea();
    }

    @Override
    public void howToColor() {
        if(this.colorable){
            System.out.print("Color all four sides");
        }
    }
}
