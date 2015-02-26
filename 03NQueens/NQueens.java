import java.util.*;
import java.io.*;


public class NQueens{
    //constants for the class
    //terminal specific character to clear screen , or hide/show cursor
    final static String clear =  "\033[2J";
    final static String hide =  "\033[?25l";
    final static String show =  "\033[?25h";
    
    //instance variable
    private char[][]board;
    private int size;

    
    //terminal specific character to move the cursor
    private String go(int x,int y){
	return ("\033[" + x + ";" + y + "H");
    }

    public String name(){
	return "majumder.abhimannu";
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
	board = new char[size1][size1];
	size = size1;
	for (int rows = 0; rows < size; rows++){
	    for (int cols = 0; cols < size; cols++){
		board[rows][cols] = '.';
	    }
	}
    }
	
    public boolean solve(){
	int[] coordinates = new int[size];
	for (int i = 0; i < size; i++){
	    coordinates[i] = -1;
	}
	return solve(0,0,0,coordinates);
    }
					 
    public boolean solve(int y,int x,int count,int[] coordinates){
	System.out.println(this);
	wait(20);
	if (count == size){
	    return true;
	}
	if (y < 0 || y >= size|| x < 0 || x >= size){
	    return false;
	}
	board[y][x] = 'Q';
	coordinates[y] = x;
	for (int i = 0; i < y;i++){
	    if (x == coordinates[i] || (float)(x - coordinates[i])/(y-i) == 1 || (float)(x - coordinates[i])/(y - i) == -1){
		board[y][x] = '.';
		return solve(y,x+1,count,coordinates);
	    }
	}
	if (solve(y + 1, 0, count + 1, coordinates)){
	    return true;
	}
	board[y][x] = '.';
	return solve(y, x+1,count,coordinates);
    }

	public static void main(String[]args){
	    NQueens x = new NQueens(10);
	    x.solve();
	}
    
    }
