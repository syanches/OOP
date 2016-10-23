
/**
 * Created by Артём on 24.10.2016.
 */
import javax.swing.*;
import java.awt.*;
import java.*;
public class CirclePanel extends JPanel{
    public void paintComponent(Graphics page){
     page.setColor(Color.BLACK);
     page.fillOval(200,300,10,10);
    }
}
