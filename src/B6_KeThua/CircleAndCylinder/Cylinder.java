package B6_KeThua.CircleAndCylinder;

public class Cylinder extends Circle {
    private float height;

    public Cylinder() {
    }


    public Cylinder(float radius, String color, float height) {
        super(radius, color);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getVolume(){
        return this.height*this.getArea();
    }

    @Override
    public String toString() {
        return "radius is:  "
                +getRadius()
                + " Volume is: "
                +getVolume()
                +" the color is "
                + getColor();

    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, "blue", 6);
        System.out.println(cylinder);
    }
}
