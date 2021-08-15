package lachance.main;

class Player {
      private String name;
      private int number;
  
      Player(String name) {
          this.name = name;
      }
  
      public int guessNumber() {
          number = (int) (Math.random() * GuessGame.range);
          return number;
      }
  
      @Override
      public String toString() {
          return "Player Won: " + name + "\nCorrect number guessed: " + number;
      } 
 }
