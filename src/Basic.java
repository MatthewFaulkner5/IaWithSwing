import javax.swing.*;
import java.awt.*;

public class Basic extends JPanel {

    private JFrame frame;

    public Basic (int width, int height){
        frame = new JFrame("Basic Graph");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(width, height);
        frame.getContentPane().add(this);
        frame.setVisible(true);
    }


    @Override
    public void paintComponent(Graphics g) {
        int left = 50;
        int top = 80;
        int width = 40;
        int height = 150;
        //g.setColor(Color.CYAN);
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i= t.getImage();
        g.drawImage(i,0,0,this);
    }
}