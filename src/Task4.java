import java.util.Scanner;
import java.lang.Math;

class Task4{
    static void main() {
        Scanner scan = new Scanner(System.in);
        int ticketNum;
        int userGuess = 0;
        boolean validGuess = false;

        ticketNum = (int)(Math.random() * 15) + 20;

        do{
            System.out.println("What number do you think the ticket is?(20-35)");
            if (scan.hasNextInt()){
                userGuess = scan.nextInt();
                if(userGuess >= 20 && userGuess <= 35) {
                    validGuess = true;
                }else{
                    System.out.println("Enter a number 20-35");
                }
            }else {
                System.out.println("Enter a whole number.");
            }
            scan.nextLine();
        }while(!validGuess);


        if (userGuess == ticketNum){
            System.out.println("You're right! It was " + ticketNum + "!");
        }else if (userGuess > ticketNum){
            System.out.println("Your guess was over, it was " + ticketNum + ".");
        }else {
            System.out.println("Your guess was lower, it was " + ticketNum + ".");
        }

    }
}
