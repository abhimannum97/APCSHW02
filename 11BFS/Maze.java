import java.util.*

public class Maze{
    private int[][] maze;
    private Frontier current;
    private static final String clear = "\033[2J";
    private static final String hide =  "\033[?25l";
    private static final String show =  "\033[?25h";
    
    private String go(int x,int y){
	return ("\033[" + x + ";" + y + "H");
    }

    public Maze(String filename){
	startx = -1;
	starty = -1;
	//read the whole maze into a single string first
	String ans = "";
	try{
	    Scanner in = new Scanner(new File(filename));
	    //keep reading next line
	    while(in.hasNext()){
		String line = in.nextLine();
		if(maxy == 0){
		    //calculate width of the maze
		    maxx = line.length();
		}
		
		//every new line add 1 to the height of the maze
		maxy++;
		ans += line;
		
	    }
	}
	catch(Exception e){
	    System.out.println("File: " + filename + " could not be opened.");
	    e.printStackTrace();
	    System.exit(0);
	}
    }

    public boolean solveBest(){
	Frontier rest = new Fronteir(mode);
	Point start = new Coordinate(startx, starty);
	while(



    public String toString(){ //do not do the funky character
	

    public String toString(boolean animate); //do the funky character codes when animate is true

    /**Solve the maze using a frontier in a BFS manner. 
     * When animate is true, print the board at each step of the algorithm.
     * Replace spaces with x's as you traverse the maze. 
     */
    public boolean solveBFS(boolean animate){    }

    /**Solve the maze using a frontier in a DFS manner. 
     * When animate is true, print the board at each step of the algorithm.
     * Replace spaces with x's as you traverse the maze. 
     */
    public boolean solveDFS(boolean animate){    }

    public boolean solveBFS(){
return solveBFS(false);
    }
    public boolean solveDFS(){
return solveDFS(false);
    }
}

