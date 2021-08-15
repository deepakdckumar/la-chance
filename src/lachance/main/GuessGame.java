 package lachance.main;

 class GuessGame {
      private Player[] players;
      private int numberOfPlayers;
      private static int count = 0;
      public static int range = 10;
      
      GuessGame(int numberOfPlayers) {
          this.numberOfPlayers = numberOfPlayers;
          players = new Player[numberOfPlayers];
      }   
      
      public void setPlayerName(String name) {
          players[count] =  new Player(name);
          count++;
      }   
      
      public void gameEngineStart() {
          int randomNumber = (int) (Math.random() * range);
          System.out.println(randomNumber);
          boolean status = true;
          while(status) {
              int i = 0;
              while(i < numberOfPlayers) {
                  int playerGuessedNumber = players[i].guessNumber();
                  if(playerGuessedNumber == randomNumber) {
                      System.out.println(players[i].toString());
                      status = false;
                      break; 
                  }   
                  i++;
              }   
          }   
      }   
 }
