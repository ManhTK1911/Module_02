package PointV2;

public class MoveablePointV2 extends PointV2 {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePointV2(){
    }

    public MoveablePointV2(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePointV2(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] speed = {this.getXSpeed(), this.getYSpeed()};
        return speed;
    }

    public MoveablePointV2 move() {
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" + "x="
                + super.getX() + ", y="
                + super.getY() + ", xSpeed="
                + this.getXSpeed() + ", ySpeed="
                + this.getYSpeed() + '}';
    }
}
