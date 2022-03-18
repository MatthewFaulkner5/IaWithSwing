import java.util.Scanner;  // Import the Scanner class

public class Main {
    static void Intro(){
        String[] myArray = {"1.Enter Username","2.New Account","3.Exit"};
        Display(myArray);
        Scanner myInput = new Scanner(System.in); // Create Scanner object
        String userName = myInput.nextLine();  // Read user input
        switch(userName) {
            case "1":
                // code block
                System.out.println("beeptfgh");
                break;
            case "2":
                // code block
                System.out.println("Bopoemfvg");
                break;
            case "3":
                System.out.println("Exitting");
                System.exit(0);
            default:
                System.out.println("Wrong. Exit and try again");
        }
}
    static void NewAccount(){
        Scanner myInput = new Scanner(System.in); // Create Scanner object
        System.out.println("Enter New Username");
        String userName = myInput.nextLine();  // Read user input
        System.out.println("Enter Password");
        String Password = myInput.nextLine();  // Read user input

    }

    static void Display(String text[]){
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


    public static void main(String[] args) {







    }

}
