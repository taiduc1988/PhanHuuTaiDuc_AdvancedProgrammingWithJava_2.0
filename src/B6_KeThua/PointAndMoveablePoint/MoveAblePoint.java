package B6_KeThua.PointAndMoveablePoint;

public class MoveAblePoint extends Point {
    private float xSpeed =1.0f;
    private float ySpeed = 1.0f;

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveAblePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveAblePoint(){

    }
    private float getXSpeed(){
        return xSpeed;
    }
    private float getYSpeed(){
        return ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed, this.ySpeed};
    }
    public void setXSpeed(float newSpeedX){
        this.xSpeed = newSpeedX;
    }
    public void setYSpeed(float newSpeedY){
        this.ySpeed = newSpeedY;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + ")" + " and "+ "(" + getXSpeed() + "," + getYSpeed() + ")";
    }

    public Point Move(){
        setX(super.getX()+getXSpeed());
        setY(super.getY()+getYSpeed());
        return this;
    }
}
