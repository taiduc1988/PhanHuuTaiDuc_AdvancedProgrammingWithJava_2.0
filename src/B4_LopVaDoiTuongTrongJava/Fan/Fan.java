package B4_LopVaDoiTuongTrongJava.Fan;

public class Fan {
    private final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean status = false;
    private double radius = 5.0;
    private String color = "Blue";

    public Fan() {
    }

    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }


    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        if (status){
            return "Fan is on, speed is: " + this.getSpeed() + " ;radius: " + this.getRadius() + " ;color: " + this.getColor();

        }else {
            return "Fan is off " + "; color is:" + getColor()+ " ;radius is: "+ getRadius();
        }
    }
}
