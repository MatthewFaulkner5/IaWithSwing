import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel implements ActionListener, DocumentListener {
    // canvas for other GUI widgets
    JButton button1 = new JButton("Login");
    JButton button2 = new JButton("Sign up");
    JButton button3  = new JButton("Exit");
    AccountHandler Myhandler = new AccountHandler();


    public GUI(int width, int height, int type) {
        System.out.println("SQUENCE: GUI constructor");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);

        button1.setBounds(0,0, 100, 40);
        button1.addActionListener(this);
        button2.setBounds(120,0, 100, 40);
        button2.addActionListener(this);
        button3.setBounds(240,0, 100, 40);
        button3.addActionListener(this);
        add(button1);
        add(button2);
        add(button3);
        if (type == 1){

            button1.setVisible(true);
            button2.setVisible(true);
            button3.setVisible(true);
        }else if (type == 2){
            button1.setVisible(false);button2.setVisible(false);button3.setVisible(false);
            JTextField username = new JTextField("Jake");
            username.setBounds(20,60,200,40);
            username.getDocument().addDocumentListener(this);
            add(username);
        }




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
        if (e.getActionCommand().equals("Exit")){
            Myhandler.SwitchMenu(3);
        } else if (e.getActionCommand() == "Login"){
            Myhandler.SwitchMenu(1);
        } else if (e.getActionCommand() == "Sign up"){
            Myhandler.SwitchMenu(2);
        }
    }


}