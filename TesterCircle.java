
/**
 * Created by Артём on 24.10.2016.
 */
import java.*;
import javax.swing.*;
import java.awt.*;
public class TesterCircle {
    public static void main(String[] args) {
        Circle c1= new Circle();
        Circle c2= new Circle(1,2,3,Color.GREEN);
        Circle c3= new Circle(3,3,5,Color.RED);
        JFrame f = new JFrame("Пример диалогового окна");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600 , 500);
        f.getContentPane().add(new CirclePanel());
        f.setVisible(true);
    }
}
