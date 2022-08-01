import java.util.*;

public class TicTacToeMain {

   public static void main (String[] args) {
   
   
      // Prints out the instructions for the game.
      System.out.println("This program is a two player game of Tic Tac Toe.");
      System.out.println("Player 1 is X and Player 2 is O.");
      System.out.println("Interact with the gameBoard by using numbers 1-9 as locations on the grid. It is similar to a phone numpad. ");
      System.out.println("Player 1 make your move!");
      
      Scanner scnr = new Scanner(System.in);
      
      // This is the game object to access methods in TicTacToeGameMethods.
      TicTacToeGameMethods gameObject = new TicTacToeGameMethods();
   
      int playerInput = 0;
      
      boolean gameActive = true;
      boolean player1Turn = true;
      
      
      
      int numMoves = 0;
      
      // Sets keep track of the moves played by the player.
      Set<Integer> player1MoveTracker = new HashSet<Integer>();
      Set<Integer> player2MoveTracker = new HashSet<Integer>();
           
           
      // These boolean values keep track if there is a piece in the pos1, pos2 etc.     
      boolean pos1 = false;
      boolean pos2 = false;
      boolean pos3 = false;
      boolean pos4 = false;
      boolean pos5 = false;
      boolean pos6 = false;
      boolean pos7 = false;
      boolean pos8 = false;
      boolean pos9 = false;
      
   
      // String array that visualizes the game board.
      String[][] gameBoard = {{" ", "|", " ", "|", " "},
                             {"-", "+", "-", "+", "-"},
                             {" ", "|", " ", "|", " "},
                             {"-", "+", "-", "+", "-"},
                             {" ", "|", " ", "|", " "}};      
                
      TicTacToeGameMethods.printBoard(gameBoard); 
      playerInput = gameObject.getInput();
      
    
   //Player gameplay mechanics that play both player 1 and 2.
      while (gameActive) {
         while (player1Turn){
            if (gameActive == false){
            break;
            }
            // Checks if 9 moves have been reached as that is the longest a game of tic tac toe can last.
            if (numMoves == 9) {
               System.out.println("9 moves reached game over!"); 
               gameActive = false;
               break;
            }
            else if (playerInput == 1) {
             // Checks if the pos1 is occupied.
               if (pos1){
                  System.out.print("Invalid move. " + "Please enter a valid move:  ");
                  playerInput = gameObject.getInput();
               }
               // Implements the game by updating the String array gameBoard corresponding to the player's move.
               else {
                  gameBoard[0][0] = "X";      
                  TicTacToeGameMethods.printBoard(gameBoard);
                  numMoves ++;
                  pos1 = true;
                  player1Turn = false;
                  player1MoveTracker.add(1);
               }
               // Checks for the winner of the game after every move.
               if (TicTacToeGameMethods.checkWinner(player1MoveTracker)) {
                  System.out.print("Player 1 is a Winner!");
                  gameActive = false;
                  break;
               }
               System.out.print("Player 2 it is your turn: ");
               playerInput = gameObject.getInput();
               
                                 
                  
            }
            
            // The same steps are repeated for both players 1 and 2 for all cases from 1-9.
            else if (playerInput == 2) {
               if (pos2){
                  System.out.print("Invalid move. " + "Please enter a valid move:  ");
                  playerInput = gameObject.getInput();
               }
               else{ gameBoard[0][2] = "X";      
                  TicTacToeGameMethods.printBoard(gameBoard);
                  numMoves ++;
                  pos2 = true;
                  player1Turn = false;                 
                  player1MoveTracker.add(2);
                  if (TicTacToeGameMethods.checkWinner(player1MoveTracker)) {
                     System.out.print("Player 1 is a Winner!");
                     gameActive = false;
                     break;
                  }
                  System.out.print("Player 2 it is your turn: "); 
                  playerInput = gameObject.getInput();
               }
            }
            
            else if (playerInput == 3) {
               if (pos3){
                  System.out.print("Invalid move. " + "Please enter a valid move:  ");
                  playerInput = gameObject.getInput();
               }
               else {gameBoard[0][4] = "X";      
                  TicTacToeGameMethods.printBoard(gameBoard);
                  numMoves ++;
                  pos3 = true;
                  player1Turn = false;
                  
                  player1MoveTracker.add(3);
                  if (TicTacToeGameMethods.checkWinner(player1MoveTracker)) {
                     System.out.print("Player 1 is a Winner!");
                     gameActive = false;
                     break;
                  }
                  System.out.print("Player 2 it is your turn: ");
                  playerInput = gameObject.getInput();
                  
               }
            }
            
            else if (playerInput == 4) {
               if (pos4){
                  System.out.print("Invalid move. " + "Please enter a valid move:  ");
                  playerInput = gameObject.getInput();
               }
               else {  gameBoard[2][0] = "X";      
                  TicTacToeGameMethods.printBoard(gameBoard);
                  numMoves ++;
                  pos4 = true;
                  player1Turn = false;
                  
                  player1MoveTracker.add(4);
                  if (TicTacToeGameMethods.checkWinner(player1MoveTracker)) {
                     System.out.print("Player 1 is a Winner!");
                     gameActive = false;
                     break;
                  }
                  System.out.print("Player 2 it is your turn: ");
                  playerInput = gameObject.getInput();
               }
            }
            else if (playerInput == 5) {
               if (pos5){
                  System.out.print("Invalid move. " + "Please enter a valid move:  ");
                  playerInput = gameObject.getInput();
               }
               else { gameBoard[2][2] = "X";      
                  TicTacToeGameMethods.printBoard(gameBoard);
                  numMoves ++;
                  pos5 = true;
                  player1Turn = false;
                  
                  player1MoveTracker.add(5);
                  if (TicTacToeGameMethods.checkWinner(player1MoveTracker)) {
                     System.out.print("Player 1 is a Winner!");
                     gameActive = false;
                     break;
                  }
                  System.out.print("Player 2 it is your turn: ");
                  playerInput = gameObject.getInput();
               }
            }
            
            else if (playerInput == 6) {
               if (pos6){
                  System.out.print("Invalid move. " + "Please enter a valid move:  ");
                  playerInput = gameObject.getInput();
               }
               else {gameBoard[2][4] = "X";      
                  TicTacToeGameMethods.printBoard(gameBoard);
                  numMoves ++;
                  pos6 = true;
                  player1Turn = false;
                  
                  player1MoveTracker.add(6);
                  if (TicTacToeGameMethods.checkWinner(player1MoveTracker)) {
                     System.out.print("Player 1 is a Winner!");
                     gameActive = false;
                     break;
                  }
                  System.out.print("Player 2 it is your turn: ");
                  playerInput = gameObject.getInput();
               }
            }
            
            else if (playerInput == 7) {
               if (pos7){
                  System.out.print("Invalid move. " + "Please enter a valid move:  ");
                  playerInput = gameObject.getInput();
               }
               else {  gameBoard[4][0] = "X";      
                  TicTacToeGameMethods.printBoard(gameBoard);
                  numMoves ++;
                  pos7 = true;
                  player1Turn = false;
                 
                  player1MoveTracker.add(7);
                  if (TicTacToeGameMethods.checkWinner(player1MoveTracker)) {
                     System.out.print("Player 1 is a Winner!");
                     gameActive = false;
                     break;
                  }
                  System.out.print("Player 2 it is your turn: ");
                  playerInput = gameObject.getInput();
               }
            }
            
            else if (playerInput == 8) {
               if (pos8){
                  System.out.print("Invalid move. " + "Please enter a valid move:  ");
                  playerInput = gameObject.getInput();
               }
               else { gameBoard[4][2] = "X";      
                  TicTacToeGameMethods.printBoard(gameBoard);
                  numMoves ++;
                  pos8 = true;
                  player1Turn = false;
                  
                  player1MoveTracker.add(8);
                  if (TicTacToeGameMethods.checkWinner(player1MoveTracker)) {
                     System.out.print("Player 1 is a Winner!");
                     gameActive = false;
                     break;
                  }
                  System.out.print("Player 2 it is your turn: ");
                  playerInput = gameObject.getInput();
               }
            
            }
            else if (playerInput == 9) {
               if (pos9){
                  System.out.print("Invalid move. " + "Please enter a valid move:  ");
                  playerInput = gameObject.getInput();
               }
               else { gameBoard[4][4] = "X";      
                  TicTacToeGameMethods.printBoard(gameBoard);
                  numMoves ++;
                  pos9 = true;
                  player1Turn = false;
                  
                  player1MoveTracker.add(9);
                  if (TicTacToeGameMethods.checkWinner(player1MoveTracker)) {
                     System.out.print("Player 1 is a Winner!");
                     gameActive = false;
                     break;
                  }
                  System.out.print("Player 2 it is your turn: ");
                  playerInput = gameObject.getInput();
               }
            }
            break;
            }
         
            while (player1Turn == false) {
               if (gameActive == false){
            break;
            }
               if (numMoves == 9) {
                  System.out.println("9 moves reached game over!"); 
                  gameActive = false;
                  break;
               
               }
               else if (playerInput == 1) {
                  if (pos1){
                     System.out.print("Invalid move. " + "Please enter a valid move:  ");
                     playerInput = gameObject.getInput();
                  }
                  else {
                     gameBoard[0][0] = "O";      
                     TicTacToeGameMethods.printBoard(gameBoard);
                     numMoves ++;
                     pos1 = true;
                     player1Turn = true;
                    
                     player2MoveTracker.add(1);
                     if (TicTacToeGameMethods.checkWinner(player2MoveTracker)) {
                        System.out.print("Player 2 is a Winner!");
                        gameActive = false;
                        break;
                     }
                     System.out.print("Player 1 it is your turn: ");
                     playerInput = gameObject.getInput();
                  }
               }
               
               else if (playerInput == 2) {
                  if (pos2){
                     System.out.print("Invalid move. " + "Please enter a valid move:  ");
                     playerInput = gameObject.getInput();
                  }
                  else{ gameBoard[0][2] = "O";      
                     TicTacToeGameMethods.printBoard(gameBoard);
                     numMoves ++;
                     pos2 = true;
                     player1Turn = true;
                     player2MoveTracker.add(2);
                     if (TicTacToeGameMethods.checkWinner(player2MoveTracker)) {
                        System.out.print("Player 2 is a Winner!");
                        gameActive = false;
                        break;
                     }
                     System.out.print("Player 1 it is your turn: ");
                     playerInput = gameObject.getInput();
                  }
               }
               
               else if (playerInput == 3) {
                  if (pos3){
                     System.out.print("Invalid move. " + "Please enter a valid move:  ");
                     playerInput = gameObject.getInput();
                  }
                  else {gameBoard[0][4] = "O";      
                     TicTacToeGameMethods.printBoard(gameBoard);
                     numMoves ++;
                     pos3 = true;
                     player1Turn = true;
                     player2MoveTracker.add(3);
                     if (TicTacToeGameMethods.checkWinner(player2MoveTracker)) {
                        System.out.print("Player 2 is a Winner!");
                        gameActive = false;
                        break;
                     }
                     System.out.print("Player 1 it is your turn: ");
                     playerInput = gameObject.getInput();
                  }
               }
               
               else if (playerInput == 4) {
                  if (pos4){
                     System.out.print("Invalid move. " + "Please enter a valid move:  ");
                     playerInput = gameObject.getInput();
                  }
                  else {  gameBoard[2][0] = "O";      
                     TicTacToeGameMethods.printBoard(gameBoard);
                     numMoves ++;
                     pos4 = true;
                     player1Turn = true;
                     player2MoveTracker.add(4);
                     if (TicTacToeGameMethods.checkWinner(player2MoveTracker)) {
                        System.out.print("Player 2 is a Winner!");
                        gameActive = false;
                        break;
                     }
                     System.out.print("Player 1 it is your turn: ");
                     playerInput = gameObject.getInput();
                  }
               }
               else if (playerInput == 5) {
                  if (pos5){
                     System.out.print("Invalid move. " + "Please enter a valid move:  ");
                     playerInput = gameObject.getInput();
                  }
                  else { gameBoard[2][2] = "O";      
                     TicTacToeGameMethods.printBoard(gameBoard);
                     numMoves ++;
                     pos5 = true;
                     player1Turn = true;
                     player2MoveTracker.add(5);
                     if (TicTacToeGameMethods.checkWinner(player2MoveTracker)) {
                        System.out.print("Player 2 is a Winner!");
                        gameActive = false;
                        break;
                     }
                     System.out.print("Player 1 it is your turn: ");
                     playerInput = gameObject.getInput();
                  }
               }
               
               else if (playerInput == 6) {
                  if (pos6) {
                     System.out.print("Invalid move. " + "Please enter a valid move:  ");
                     playerInput = gameObject.getInput();
                  }
                  else {gameBoard[2][4] = "O";      
                     TicTacToeGameMethods.printBoard(gameBoard);
                     numMoves ++;
                     pos6 = true;
                     player1Turn = true;
                     player2MoveTracker.add(6);
                     if (TicTacToeGameMethods.checkWinner(player2MoveTracker)) {
                        System.out.print("Player 2 is a Winner!");
                        gameActive = false;
                        break;
                        
                     }
                     System.out.print("Player 1 it is your turn: ");
                     playerInput = gameObject.getInput();
                  }
               }
               
               else if (playerInput == 7) {
                  if (pos7){
                     System.out.print("Invalid move. " + "Please enter a valid move: ");
                     playerInput = gameObject.getInput();
                  }
                  else {  gameBoard[4][0] = "O";      
                     TicTacToeGameMethods.printBoard(gameBoard);
                     numMoves ++;
                     pos7 = true;
                     player1Turn = true;
                     player2MoveTracker.add(7);
                     if (TicTacToeGameMethods.checkWinner(player2MoveTracker)) {
                        System.out.print("Player 2 is a Winner!");
                        gameActive = false;
                        break;
                     }
                     System.out.print("Player 1 it is your turn: ");
                     playerInput = gameObject.getInput();
                  }
               }
               
               else if (playerInput == 8) {
                  if (pos8){
                     System.out.print("Invalid move. " + "Please enter a valid move:  ");
                     playerInput = gameObject.getInput();
                  }
                  else { gameBoard[4][2] = "O";      
                     TicTacToeGameMethods.printBoard(gameBoard);
                     numMoves ++;
                     pos8 = true;
                     player1Turn = true;
                     player2MoveTracker.add(8);
                     if (TicTacToeGameMethods.checkWinner(player2MoveTracker)) {
                        System.out.print("Player 2 is a Winner!");
                        gameActive = false;
                        break;
                     }
                     System.out.print("Player 1 it is your turn: ");
                     playerInput = gameObject.getInput();
                  }
               
               }
               else if (playerInput == 9) {
                  if (pos9){
                     System.out.print("Invalid move. " + "Please enter a valid move:  ");
                     playerInput = gameObject.getInput();
                  }
                  else { gameBoard[4][4] = "O";      
                     TicTacToeGameMethods.printBoard(gameBoard);
                     numMoves ++;
                     pos9 = true;
                     player1Turn = true;
                     player2MoveTracker.add(9);
                     if (TicTacToeGameMethods.checkWinner(player2MoveTracker)) {
                        System.out.print("Player 2 is a Winner!");
                        gameActive = false;
                        break;
                     }
                     System.out.print("Player 1 it is your turn: ");
                     playerInput = gameObject.getInput();
                  }
               }
            
            break;
            }
         }
            // Checks if the game is a tie.
         if (TicTacToeGameMethods.checkWinner(player1MoveTracker) == false  && (TicTacToeGameMethods.checkWinner(player2MoveTracker) == false)){
            System.out.print("The game is a draw.");
         }
         
      }
   }//End class
