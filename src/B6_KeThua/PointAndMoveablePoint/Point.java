package B6_KeThua.PointAndMoveablePoint;

public class Point {
    private float x = 1.0f;
    private float y = 1.0f;

    public Point(){

    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY(){
        return y;
    }
    public float[] getXY(){
        return new float[]{this.x, this.y};
    }
    public  void setX(float newPositionX){
        this.x = newPositionX;
    }
    public void setY(float newPositionY){
        this.y = newPositionY;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + this.x +"," + this.y + " )";
    }
}
