package B6_KeThua.CircleAndCylinder;

public class Circle {
    protected float radius;
    protected String color;

    public Circle() {
        this.radius = 1;
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(String color) {
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getArea(){
        return (float) (this.radius*this.radius*Math.PI);
    }

    public String toString(){
        return "A Circle with radius =" + this.radius + " , color is: " + this.color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5, "red");

        System.out.println(circle);
    }

}
