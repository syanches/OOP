package syanches;

/**
 * Created by Артём on 16.09.2016.
 */
import java.lang.*;
public class Circle{
    private int x;
    private int y;
    private int r;

public Circle(){
    x=0;
    y=0;
    r=1;
}
public Circle(int x, int y, int r){
    this.x=x;
    this.y=y;
    this.r=r;
}
public int getX(){
    return x;
}
public int getY() {
    return y;
}
public int getR() {
    return r;
}
public int getRadius() {
    return r;
}
public void setX(int x){
    this.x=x;
}
public void setR(int r) {
    this.r=r;
}
public void setY(int y){
    this.y=y;
}
public double getArea(){
    return Math.PI*r*r;
}
}



