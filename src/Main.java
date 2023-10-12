import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // vars

        int myNumber = (int)(Math.random() * 10) + 1;
        int yourNum;

        System.out.println("Welcome! Let's play a game.");
        System.out.println("Try to guess my number!");

        //checks

        do {
            System.out.println("Enter a number [1-10]:");

            if(scan.hasNextInt()){
                yourNum = scan.nextInt();
                if(yourNum > 0 && yourNum < 11){
                    break;
                }
            }
            System.out.println("Sorry, you're guess is invalid. Please try again.");
            scan.nextLine();
        } while (true);

        if(myNumber > yourNum){
            System.out.println("My number was " + myNumber + ".\nYour guess was too low.");
        }else if(myNumber < yourNum){
            System.out.println("My number was " + myNumber + ".\nYour guess was too high.");
        }else{
            System.out.println("My number was " + myNumber + ".\nYou got it right!");
        }
    }
}