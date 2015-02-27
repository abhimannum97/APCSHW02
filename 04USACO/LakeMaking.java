import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LakeMaking{
    // R=rows, C=Columns, E=elevation, N=stomp digging instructions
    int R, C, E, N;
    int[][] topo;
    int[][] instructions;
    File file;

    public LakeMaking{
	file = new File("lakemaking.txt");
	Scanner sc = new Scanner(file);
	while (sc.hasNextInt()){
	    R = sc.nextInt();
	    C = sc.nextInt();
	    E = sc.nextInt();
	    N = sc.nextInt();
	    for (int r = 0; r < R; r++){
		for (int c = 0; c < C; c++){
		    topo[r][c] = sc.nextInt();
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
	    int max = 0;
	    for (int r = row-1; r < r + 3; r++){
		for (int c = col-1; c < c + 3; c++){
		    if (topo[r][c] > max){
			max = topo[r][c];
		    }
		}
	    }
	    for (int r = row - 1; r < r + 3; r++){
		for (int c = col-1; c < c + 3; c++){
		    if (topo[r][c] <= max && topo[r][c] >= max - dig){
			topo[r][c] = max - dig;
		    }
		}
	    }
	}
	for (int r = 0; r < topo.length; r++){
	    for (int c = 0; c < topo[0].length; c++){
		topo[r][c] = E - topo[r][c];
		if (topo[r][c] < 0){
		    topo[r][c] = -1;
		}
	    }
	}
	
    