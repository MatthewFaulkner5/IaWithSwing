import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Objects;
import java.util.Scanner;

public class AccountHandler {
    int response = 0;
    String filename = "\\\\bex-file-01\\studenthome$\\16\\16Faulkner_M\\File04.txt";
    FileHandler myHandler = new FileHandler(filename,30);
    JFrame frame = new JFrame("Demo frame");



    public void IntroMenu(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI mygui = new GUI(340,200,1);
        frame.add(mygui);
        frame.pack();
        frame.setVisible(true);

    }
    public void SwitchMenu(int num){

        response = num;
        if (response == 1) {

            LoginMenu();
        } else if (response == 2) {
            NewAccount();
        } else if (response == 3) {
            System.exit(0);
        }

    }

    public void Display(String text[]){
        //code puts a box around code, only temporary and just for my own benefit, as this will be done by swing
        String spaces;
        int spacesnum;
        System.out.println("+============================+");
        //Changes where the sides are depending on the longest length of the menu options
        for (int i = 0;i< text.length;i++) {
            spaces = " ";
            spacesnum = 28 - text[i].length();
            for (int j = 1;j<spacesnum;j++) {
                spaces = spaces + " ";
            }
            System.out.println("|" + text[i] + spaces + "|");
        }
        System.out.println("+============================+");

    }

    public void NewAccount(){

        String[] text = new String[1];
        Scanner myInput = new Scanner(System.in); // Create Scanner object
        text[0] = "Enter Username";Display(text);
        String userName = myInput.nextLine();  // Read user input
        FileHandler myHandler = new FileHandler(filename,35);
        text[0] = "Enter Password";Display(text);String Password = myInput.nextLine();  // Read user input
        text[0] = "Student or Teacher?";Display(text);String StudentTeacher = myInput.nextLine();
        String Answer = "";
        if (Objects.equals(StudentTeacher, "Student")) {
            Answer = "Student";
        } else if (Objects.equals(StudentTeacher, "Teacher")) {
            Answer = "Teacher";
        } else {
            System.out.println("No can dooo");
            IntroMenu();
        }
        FileHandler.appendRecord(userName + "," + Password + "," + Answer, 35 );
        System.out.println("Done");
        IntroMenu();

    }
    public void LoginMenu(){

        // Create Scanner object
      // Read user input
        //if (myHandler.findRecord(userName + "," + Password + "," + "Teacher") == true){
        //    System.out.println(" teacher account found");
        //    Teacher myTeacher = new Teacher();
        //    myTeacher.TeacherIntro();
        //}
        //if (myHandler.findRecord(userName + "," + Password + "," + "Student") == true){
        //    System.out.println(" student account found");
        }
    }