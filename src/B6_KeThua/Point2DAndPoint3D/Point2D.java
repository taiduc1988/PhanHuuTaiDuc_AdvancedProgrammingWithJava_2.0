package B6_KeThua.Point2DAndPoint3D;

public class Point2D {
    protected float x = 1;
    protected float y = 1;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{this.x, this.y};
    }

    public void setXY(float newX, float newY){
        this.x = newX;
        this.y = newY;
    }

    public  String toString(){
        return "(" + getX() + "," + getY() + ")";
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(4,6);
        System.out.println(point2D);
    }
}
