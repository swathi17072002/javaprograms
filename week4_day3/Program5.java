/*Create a simple game of rock-paper-scissors where the one player plays against the another player. Use conditional statements to determine the winner of each round. */

import java.util.Scanner;
public class Program5{
  public static  void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int player1_choice,player2_choice;
    System.out.println("enter your choice");
    System.out.println("1. Rock");
    System.out.println("2.Paper");
    System.out.println("3.Scissors");
    System.out.println("enter the player1 choice and player2 choice");
    player1_choice = sc.nextInt();
    player2_choice = sc.nextInt();
    if (player1_choice==player2_choice)
    {
      System.out.println("Draw");
    }
    else if((player1_choice==1 && player2_choice==3)||(player1_choice==2 && player2_choice==1)||(player1_choice==3 && player2_choice==2))
    {
      System.out.println("Player1 win the game");
    }
    else if((player2_choice==1 && player1_choice==3)||(player2_choice==2 && player1_choice==1)||(player2_choice==3 && player1_choice==2))
    {
      System.out.println("Player2 win the game");
    }
    else
    {
      System.out.println("Invalid number");
    }
       
    }
  }
    