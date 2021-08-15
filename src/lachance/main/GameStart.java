 package lachance.main;

 import java.util.Scanner;

 public class GameStart {

      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          System.out.print("Enter number of Players: ");
          int numberOfPlayers = scan.nextInt();
          scan.nextLine();
          GuessGame guessGame = new GuessGame(numberOfPlayers);
          System.out.println("Please type the name of Players below and hit enter after each name.");
          while(numberOfPlayers > 0) {
              guessGame.setPlayerName(scan.nextLine());
              numberOfPlayers--;
          }
          scan.close();
          guessGame.gameEngineStart();
      
      }

 }
