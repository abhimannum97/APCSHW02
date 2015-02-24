import java.util.*;
import java.io.*;


public class KnightsTour{
    //constants for the class
    //terminal specific character to clear screen , or hide/show cursor
    final static String clear =  "\033[2J";
    final static String hide =  "\033[?25l";
    final static String show =  "\033[?25h";
    
    //instance variable
    private int[][]board;
    private int size, numMoves;

    public String name(){
	return "majumder.abhimannu";
    }
    
    public KnightsTour(int length){
	board = new int[length][length];
	size = length;
	numMoves = 0;
	for (int rows = 0; rows < size; rows++){
	    for (int cols = 0; cols < size; cols++){
		board[rows][cols] = 0;
	    }
	}
    }

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
       
    
    public void solve(){
	solve(0,0);
    }
    
    public boolean solve(int x, int y){
	System.out.println(this);
	wait(20);
       	if (numMoves == size*size + 1){
	    return true;
       	}
	try{
	    if (board[y][x] != 0){
		return false;
	    }
	    if (board[y][x] == 0){
		board[y][x] = numMoves;
		numMoves++;
		if (solve(x-2,y-1) || solve(x-2,y+1) || solve(x+2,y-1) || solve(x+2,y+1) || solve(x-1,y-2) || solve(x+1,y-2)|| solve(x-1,y+2) || solve(x+1, y+2)){
		    return true;
		}
	    }
	}catch (ArrayIndexOutOfBoundsException e){
	    return false;
	}
	return false;
    }
		
	

	public static void main(String[]args){
	    KnightsTour p1 = new KnightsTour(10);
	    // System.out.println(p1.toString());
	    p1.solve(4,5);
	}
    
    
}
