import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LakeMaking{
    // R=rows, C=Columns, E=elevation, N=stomp digging instructions
    int R, C, E, N;
    int[][] topograph;
    int[][] instructions;
    File file;

    public LakeMaking{
	file = new File("lakemaking.txt")
	    Scanner sc = new Scanner(file);
	while (sc.hasNextInt()){
	    R = sc.nextInt();
	    C = sc.nextInt();
	    E = sc.nextInt();
	    N = sc.nextInt();
	    for (int r = 0; r < R; r++){
		for (int c = 0; c < C; c++){
		    topograph[r][c] = sc.nextInt();
		}
	    }
	    for (int r = 0; r < N; r++){
		for (int c = 0; c < 3; c++){
		    instructions[r][c] = sc.nextInt();
		}
	    }
	}
    }

    public int makeLake{
	for (int i = 0; i < N; i++){
	    int row = instructions[i][0];
	    int col = instructions[i][1];
	    int dig = instructions[i][2];
	    for (int r = row-1; r < r + 3; r++){
		for (int c = col-1; c < c + 3){
		    