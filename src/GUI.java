import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.MethodType;

public class GUI extends JPanel implements ActionListener, DocumentListener {
    // canvas for other GUI widgets
    JButton button1;
    JButton button2;
    public GUI(int width, int height) {
        System.out.println("SQUENCE: GUI constructor");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("b1");
        JTextField username = new JTextField();
        username.setBounds(20,60,200,40);
        button1.setBounds(0,0, 100, 40);
        button2 = new JButton("b2");
        button2.setBounds(120,0, 100, 40);
        button1.addActionListener(this);
        button2.addActionListener(this);
        username.getDocument().addDocumentListener(this);
        add(button1);
        add(username);
        add(button2);
    }


    @Override
    public void insertUpdate(DocumentEvent e){
        System.out.println("Insert");
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        System.out.println("remove");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        System.out.println("changed");
    }

    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand() == "b1"){
            System.out.println("THE FIRST BUTTON");
            Basic myBasic = new Basic(1300,1000);
        } else{
            System.out.println("THE SECOND ONE");

        }
    }


}