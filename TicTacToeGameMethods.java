import java.util.*;

// Class that contains certain methods to help run TicTacToe.
public class TicTacToeGameMethods {
   
   Scanner scnr = new Scanner(System.in);
   
   
   // Prints the board in the console below to show the current state of the game.   
   public static void printBoard(String myArray[][]) {
   
      int boardRowCount = 0;
      for (int i = 0; i < myArray.length; i++){
         for ( int j = 0; j < myArray[i].length; j++) {
            System.out.print(myArray[i][j]);
            boardRowCount ++;
            // The following code allows the game board to be formatted properly.
            if (boardRowCount == 5) {
               System.out.println();
               boardRowCount = 0;
            }
         }
      }
   }
      
      
   // Checks if any player has won the game of tic tac toe.   
   public static boolean checkWinner(Set<Integer> playerMovesSet) {
     
     // All the 8 possible win conditions on the TicTacToe board and listed below.
     // If any player has the 3 numbers in their move tracker sets, then they have won.    
        
      boolean isGameWon = false;
     
      
      if (playerMovesSet.contains(1) && playerMovesSet.contains(2) && playerMovesSet.contains(3)) {
         isGameWon = true;
      }
      else if (playerMovesSet.contains(4) && playerMovesSet.contains(5) && playerMovesSet.contains(6)){
         isGameWon = true;
      }
      else if (playerMovesSet.contains(7) && playerMovesSet.contains(8) && playerMovesSet.contains(9)){
         isGameWon = true;
      }
      else if (playerMovesSet.contains(1) && playerMovesSet.contains(4) && playerMovesSet.contains(7)){
         isGameWon = true;
      }
      else if (playerMovesSet.contains(2) && playerMovesSet.contains(5) && playerMovesSet.contains(8)){
         isGameWon = true;
      }
      else if (playerMovesSet.contains(3) && playerMovesSet.contains(6) && playerMovesSet.contains(9)){
         isGameWon = true;
      }
      else if (playerMovesSet.contains(1) && playerMovesSet.contains(5) && playerMovesSet.contains(9)){
         isGameWon = true;
      }
      else if (playerMovesSet.contains(3) && playerMovesSet.contains(5) && playerMovesSet.contains(7)){
         isGameWon = true;
      }
      
      return isGameWon;
   }
   
   // Gets input from the user and returns an int. Also checks for validity of the input. 
   public int getInput() {
   
      int returnValue= 0;
      String userInput =scnr.next();
      boolean isValid = false;
   
      while (isValid == false)
         try 
         {
            returnValue = Integer.parseInt(userInput);
            if ( returnValue == 1 || returnValue == 2 || returnValue == 3 || returnValue == 4 || returnValue == 5 || returnValue == 6 || returnValue == 7 || returnValue == 8 || returnValue == 9) {
               isValid = true;
               return returnValue;
            }
            else {
               System.out.println("Please pick a valid number between 1-9: ");
               returnValue = getInput();
               return returnValue;
            }
         }  
         catch (Exception e) {
            System.out.println("Please pick a valid number between 1-9: ");
            isValid = false;
            returnValue = getInput();
            return returnValue;
         }
      return returnValue;
   }
}

// End class
     
     
     
     
   
