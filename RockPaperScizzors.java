import java.util.Random;
import java.util.Scanner;

public class RockPaperScizzors {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
        String[] rps = {"Rock", "Paper", "Scizzors"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        String playerMove;

        while (true) {
            System.out.println("Please enter your move");
            playerMove = scanner.nextLine();
            if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scizzors")){
            break;
        }
        System.out.println(playerMove + " is not valid move.");   
    }
   System.out.println("Computer chose " + computerMove);
   if (playerMove.equals(computerMove)) {
        System.out.println("The game was a tie!");
   }
   else if (playerMove.equals("Rock")) {
    if (computerMove.equals("Paper")) {
        System.out.println("Computer won!");
    
    }else if (computerMove.equals("Scizzors")) {   
        System.out.println("You won!");
        }
    }
    else if (playerMove.equals("Paper")) {
    if (computerMove.equals("Scizzors")) {
        System.out.println("Computer won!");
    
    }else if (computerMove.equals("Rock")) {   
        System.out.println("You won!");
        }
    }
    else if (playerMove.equals("Scizzors")) {
    if (computerMove.equals("Rock")) {
        System.out.println("Computer won!");
    
    }else if (computerMove.equals("Paper")) {   
        System.out.println("You won!");
        } 
    }    
    System.out.println("You wanna play again? (yes/no)");
    String playAgain = scanner.nextLine();
    
    if (!playAgain.equals("yes")){
        break;
    }
}
scanner.close();
}
}