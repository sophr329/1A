package tictactoe;

/**
 * 
 * @author 
 *
 */

public class TicTacToe {
	
	    private String[][] board;
	    private int turn;
	    
	    /**
	     * Creates a new Tic Tac Toe board.  Instantiates the 3x3 board
	     * with all dashes or other place holders.
	     * 
	     * initializes number of turns taken to equal 0
	     */
	    
	    public TicTacToe() {
	    	
	    	board = new String[3][3];
	    	turn = 0;
	    }
	    
	    
	   
	    /**
	     * Getter method for current turn number
	     * @return number of turns taken
	     */
	    
	    public int getTurn() {
	    	return turn;
	    }
	    
	    
	    
	   
	   /**
	    * This method prints out the board array on to the console
	    */
	    
	   public void printBoard()
	   {
	       
		   for(int r = 0; r < board.length; r++) {
			 for(int c = 0; c < board[r].length; c++) {
				   board[r][c] = " - ";
				   System.out.print(board[r][c]);
			 }
			 System.out.println(" ");
		   }
	       
	   }
	   
	   /**
	    * 
	    * This method determines if space row, col is an available space to choose
	    * @return: true if the board[row][col] is available, false otherwise
	    * 
	    */
	   
	   public boolean pickLocation(int row, int col)
	   {
	        if(board[row][col] != " - ") {
	        	return false;
	        }
	        else {
	        	return true;
	        }
	   }
	   
	   /**
	    * 
	    * This method places an X or O at board[row][col] based on the int turn
	    * Evens X, Odds O
	    */
	   
	   public void takeTurn(int row, int col)
	   {
	      
	    	  if(turn % 2 == 0)
	    	  {
	    		  board[row][col] = " X ";
	    		  turn++;
	    	  }
	    	  else {
	    		  board[row][col] = " O ";
	    		  turn++;
	    	  }
	      
	   }
	   
	   /**
	    * 
	    * This method checks if any row has all X's or all Os
	    * @return: true if there is a row with all the same value, false otherwise. 
	    */
	   
	   
	   public boolean checkRow()
	   {
		   boolean isAll = false;
		   for(int r = 0; r < board.length; r++){
			   
			   for(int c = 0; c < board[r].length; c++){
				   String temp = board[r][0];
				   if(temp != " - " && temp == board[r][c]){
					   isAll = true;
				   }
				   else {
					   isAll = false;
				   }
			   }
			  
			  
		   }
		   return isAll;
	   }
	   
	   
	   /**
	    * 
	    * This method checks if any col has all X's or all Os
	    * @return: true if there is a col with all the same value, false otherwise. 
	    */
	   
	   public boolean checkCol()
	   {
		   boolean isAll = false;
		   for(int r = 0; r < board.length; r++){
			   
			   for(int c = 0; c < board[r].length; c++){
				   String temp = board[c][0];
				   if(temp != " - " && temp == board[c][r]){
					   isAll = true;
				   }
				   else {
					   isAll = false;
				   }
			   }
			  
			  
		   }
		   return isAll;
	   }
	   
	   
	   /**
	    * 
	    * This method checks if either diagonal has all X's or all Os
	    * @return: true if either diagonal with all the same value, false otherwise. 
	    */
	   
//	   public boolean checkDiag()
//	   {
//		   	
//	   }
	   
	   /**
	    * 
	    * This method checks if a player has won the game via a row, col, or diagonal
	    * @return: true if the game is won, false otherwise
	    */
	   public boolean checkWin()
	   {
	       if(checkRow() || checkCol()) {
	    	   return true;
	       }
	       else {
	    	   return false;
	       }
	   }

}
