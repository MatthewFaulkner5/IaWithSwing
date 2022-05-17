
import java.util.Scanner;

public class Student {
    public void StudentIntro() {
        String[] myArray = {"1.Find Topic", "2.Make Questionnaire", "3.Exit to menu"};
        Scanner myInput = new Scanner(System.in); // Create Scanner object
        String userName = myInput.nextLine();  // Read user input
        switch (userName) {
            case "1":
                FindTopic();
                break;
            case "2":
                MakeQuestionaire();
                break;
            case "3":
                System.exit(0);
            default:
                System.out.println("Wrong. Exit and try again");
        }
    }


    public void FindTopic(){
        //computer document type search thing
    }
    public void FindTopic(String keyword){
        // uses keywords to quickly narrow down search
    }

    public void MakeQuestionaire(){
        //uses keywords to add question to a seperate question maker
    }
}
