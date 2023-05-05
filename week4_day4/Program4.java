/*Create a simple game of rock-paper-scissors where the one player plays against the another player. Use conditional statements to determine the winner of each round. */

import java.util.Scanner;
 
public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        // Read moves from players
        System.out.print("Enter player 1's move (1=rock, 2=paper, 3=scissors): ");
        int player1_Move = input.nextInt();
        System.out.print("Enter player 2's move (1=rock, 2=paper, 3=scissors): ");
        int player2_Move = input.nextInt();
 
        // Determine winner using switch statement
        switch (player1_Move) {
            case 1:
                switch (player2_Move) {
                    case 1:
                        System.out.println("tie");
                        break;
                    case 2:
                        System.out.println("player 2 wins");
                        break;
                    case 3:
                        System.out.println("player 1 wins");
                        break;
                    default:
                        System.out.println("Invalid move entered");
                        break;
                }
                break;
            case 2:
                switch (player2_Move) {
                    case 1:
                        System.out.println("player 1 wins");
                        break;
                    case 2:
                        System.out.println("tie");
                        break;
                    case 3:
                        System.out.println("player 2 wins");
                        break;
                    default:
                        System.out.println("Invalid move entered");
                        break;
                }
                break;
            case 3:
                switch (player2_Move) {
                    case 1:
                        System.out.println("player 1 wins");
                        break;
                    case 2:
                        System.out.println("player 2 wins");
                        break;
                    case 3:
                        System.out.println("tie");
                        break;
                    default:
                        System.out.println("Invalid move entered");
                        break;
                }
                break;
            default:
                System.out.println("Invalid move entered");
                break;
        }
    }
}
 