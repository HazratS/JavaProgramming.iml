package day17_While_DoWhile;
import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {//It will print all the letters from A to Z

            System.out.print(i + " "); // A B C D E F (space is concatenated so that there will be space between the letters
            // and letters from A to F will be printed.

            if (i == 'F') {//The condition is given tht if i is equalled to 'F', exit the loop
                break; // Exits the loop (In order to exit the loop,you must give the break statement: break;
            }
        }

        System.out.println();//println statement is given in order to append a new line for other codes if you want to have more codes except this one

        System.out.println("---------------------------------");
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num < 0) {
                break;
            }

        }
        System.out.println();
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            if (i == 3) {
                break;
            }

           // System.out.println("---------------------------------");


/*
            if(true){
                break;
            }
*/

        }
    }

}

