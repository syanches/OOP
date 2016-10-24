/**
 * Created by liveuser on 24.10.16.
 */
public class MovablePoint implements Movable {
   int x1,y1,y2,x2, x,y,xSpeed,ySpeed;

    public MovablePoint(int x, int y,int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return "x="+x + ", y="+y;
    }
    @Override
    public void moveUp(){
        y -=ySpeed;
    }
    @Override
    public void moveDown(){
        y +=ySpeed;
    }
    @Override
    public void moveLeft(){
        x -=xSpeed;
    }
    @Override
    public void moveRight(){
        x +=xSpeed;
    }
}
