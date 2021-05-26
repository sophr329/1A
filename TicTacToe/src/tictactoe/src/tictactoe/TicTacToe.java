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
	    	
	    	for(int row = 0; row < board.length; row++)
	        {
	            for(int col = 0; col < board[row].length; col++)
	            {
	                board[row][col] = " - ";
	            }
	        }
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
		   for(int r = 0; r < board.length; r++)
	       {
	           for(int c = 0; c < board[r].length; c++)
	           {
	               
	               System.out.print(board[r][c] + " ");
	           }
	           System.out.println();
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
	        if(board[row][col] == " - ") {
	        	return true;
	        }
	        else {
	        	return false;
	        }
	   }
	   
	   /**
	    * 
	    * This method places an X or O at board[row][col] based on the int turn
	    * Evens X, Odds O
	    */
	   
	   public void takeTurn(int row, int col)
	   {
	      
	    	  if(getTurn() % 2 == 0)
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
	   
	   public boolean checkDiag()
	   {
		   String topL = board[0][0];
	       boolean isTrue = false;
	       if(!topL.equals(" - "))
	       {
	           if(topL.equals(board[1][1]) && topL.equals(board[2][2]))
	           {
	               isTrue = true;
	           }
	           
	       }
	       String topR = board[0][2];
	       if(!topR.equals( "- "))
	       {
	           if(topR.equals(board[1][1]) && topR.equals(board[2][0]))
	           {
	               isTrue = true;
	           }
	           
	       }
	       return isTrue;
	   }
	   
	   /**
	    * 
	    * This method checks if a player has won the game via a row, col, or diagonal
	    * @return: true if the game is won, false otherwise
	    */
	   public boolean checkWin()
	   {
	       if(checkRow() || checkCol() || checkDiag()) {
	    	   return true;
	       }
	       else {
	    	   return false;
	       }
	   }

}
