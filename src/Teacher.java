
import java.util.Scanner;

public class Teacher extends Student {
    public Teacher() {

    }

    public void TeacherIntro() {
        String[] myArray = {"1.Enter question", "2.Delete Q", "3.Exit to menu"};
        Scanner myInput = new Scanner(System.in); // Create Scanner object
        String userName = myInput.nextLine();  // Read user input
        switch (userName) {
            case "1":
                AddQuestion();
                break;
            case "2":
                break;
            case "3":
                AccountHandler myHandler = new AccountHandler();
                myHandler.Intro();
                System.exit(0);
            default:
                System.out.println("Wrong. Exit and try again");
        }
    }


    public void AddQuestion() {
        String Question;
        String Date;
        String Topic;
        Scanner myInput = new Scanner(System.in); // Create Scanner object
        //uses filehandler to add question to database
        System.out.println("Insert Question");
        Scanner EssayInfo = new Scanner(System.in); // Create Scanner object
        Question = myInput.nextLine();
        System.out.println("Insert Date, example 01/12/18");
        Date = myInput.nextLine();

        System.out.println("Insert Topic");
        Topic = myInput.nextLine();
        FileHandler.appendLine("\\\\bex-file-01\\studenthome$\\16\\16Faulkner_M\\Questions.txt",Topic + "," + Date + "," + Question);
    }

    public void DeleteQuestion() {
        //Deletes question from database using keywords
    }

    public void EditQuestion() {
        //Replaces question
    }
}


