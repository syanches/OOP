/**
 * Created by liveuser on 24.10.16.
 */
import java.lang.*;
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5,6,1,1);
        System.out.println(m1);
        m1.moveLeft();
        m1.moveDown();
        System.out.println(m1);

        Movable m2= new MovableCircle(2,1,2,20,5);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
