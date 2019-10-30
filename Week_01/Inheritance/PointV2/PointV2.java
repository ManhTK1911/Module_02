package PointV2;

public class PointV2 {
    private float x = 0.0f;
    private float y = 0.0f;

    public PointV2(){
    }

    public PointV2(float x, float y) {
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

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] xy= {this.getX(), this.getY()};
        return xy;
    }

    public String toString(){
        return "PointV2{" + "x="
                + this.getX() + ", y="
                + this.getY() + '}';
    }
}
