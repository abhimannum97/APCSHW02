import java.util.*;

public class Frontier{
    Coordinate one, two, three, four;
    MyDeque deq;
    int mode;

    public Frontier(int x){
	int mode = x;
	deq = new MyDeque();
    }

    private boolean solve(boolean anim, int mode){
	if (mode != 1 || mode != 2){
	    return false;
	}
	if (mode == 1){
	    
	    

    
	
    