
/**
 * Created by Артём on 24.10.2016.
 */
import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class Circle {
    private int x;
    private int y;
    private int r;
    private Color color;

    public Circle() {
        x = 1;
        y = 1;
        r = 1;
        color=Color.BLACK;
    }

    public Circle(int x, int y, int r, Color color) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.color=color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public Color getColor(){
        return color;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setColor(Color color){
        this.color=color;
    }

    public int getArea() {
        return (int) Math.PI * r * r;
    }

    public int getPerimeter() {
        return (int) Math.PI * r * 2;
    }

    public void draw(Graphics page){
        page.setColor(color);
        page.fillOval(x,y,r,r);
    }
}

