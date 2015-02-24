import java.util.*;
import java.io.*;


public class NQueens{
    //constants for the class
    //terminal specific character to clear screen , or hide/show cursor
    final static String clear =  "\033[2J";
    final static String hide =  "\033[?25l";
    final static String show =  "\033[?25h";
    
    //instance variable
    private int[][]board;
    private int size;

    
    //terminal specific character to move the cursor
    private String go(int x,int y){
	return ("\033[" + x + ";" + y + "H");
    }
    
    public void wait(int millis){
	try {
	    Thread.sleep(millis);
	}
	catch (InterruptedException e) {
	}
    }
    
    public String toString(){
	String ans = "\n";
	for (int rows = 0; rows < board.length; rows++){
	    for (int cols = 0; cols < board[0].length; cols++){ 
		ans += board[rows][cols] + " ";
		if (cols == size - 1){
		    ans += "\n";
		}
	    }
	}
	return hide + clear + go(0,0) + ans + "\n" + show;
    }
    
    public NQueens(int size1){
	board = new int[size1][size1];
	size = size1;
	for (int rows = 0; rows < size; rows++){
	    for (int cols = 0; cols < size; cols++){
		board[rows][cols] = 0;
	    }
	}
    }
	
	
    }
    
    
    public void solve(){
	
    }
    
    public void solve(int startx, int starty){
				
    }
    
    
    
    public boolean solve(int x,int y,int currentMoveNumber){
	System.out.println(this);
	wait(20);
	
	return false;
    }
    
    
}
