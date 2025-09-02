
import java.util.Scanner;

public class Calculator {

    public static int menuList(Scanner sc){
        int choice;

        System.out.println("0. Exit");
        System.out.println("1. Add");
        System.out.print("Enter the choice: ");
        choice = sc.nextInt();

        return choice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while((choice=menuList(sc))!=0){
            System.out.println("Hello "+choice);

        }


    }
    
}
