/**
 * Created by liveuser on 24.10.16.
 */
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    public String toString(){
        return "topLeft+"+topLeft+"bottomRight+"+bottomRight;
    }

    @Override
    public void moveUp(){
        topLeft.y1 -=topLeft.ySpeed;
        bottomRight.y2 -=bottomRight.ySpeed;
    }
    @Override
    public void moveDown(){
        topLeft.y1 +=topLeft.ySpeed;
    }
    @Override
    public void moveLeft(){
        x -=xSpeed;
    }
    @Override
    public void moveRight(){
        x +=xSpeed;
}
