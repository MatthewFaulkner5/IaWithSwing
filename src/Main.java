import java.io.File;
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        AccountHandler myAccHandler = new AccountHandler();
        myAccHandler.IntroMenu();
        FileHandler myFHandler = new FileHandler("\\\\bex-file-01\\studenthome$\\16\\16Faulkner_M\\File04.txt",35);
        System.out.println(myFHandler.getRecord(0));
        System.out.println(myFHandler.getRecord(1));
        System.out.println(myFHandler.findRecord("bake,nurley,Student"));


    }

}
