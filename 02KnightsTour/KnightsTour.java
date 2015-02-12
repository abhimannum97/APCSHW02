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
    //   private int maxx, maxy;
    //  private int startx, starty;

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
    
    public String toString(int maxx, int maxy){
	String ans = "\n";
	int x = maxx + (maxx - 1);
	int y = maxy + (maxy - 1);
	/*	for (int i = 0; i < x * y; i++){
	    if(i % x == 0 && i != 0){
		ans += "\n";
	    }
	*/
	for (int rows = 0; rows < y; rows++){
	    for (int cols = 0; cols < x; cols++){ 
		if (cols >= x){
		    ans += " \n";
		}
		else if (rows % 2 == 1){
		    ans += "-";
		}
		else if (cols % 2 == 1 && rows % 2 == 0){
		    ans += "|";
		}else
		    ans += " ";
		
	    }
	}
	    return hide + go(0,0) + ans + "\n" + show;
    }
    
	/*   public KnightsTour(int size){
	
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

	*/

	public static void main(String[]args){
	    KnightsTour p1 = new KnightsTour();
	    System.out.println(p1.toString(10,10));
	}
    
    
}
