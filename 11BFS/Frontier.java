import java.util.*;

public class Frontier{
    Coordinate one, two, three;
    MyDeque deq;
    int mode;

    public Frontier(int x){
	int mode = x;
	deq = new MyDeque();
    }

    public void add(Coordinate coor){
	if (mode == 1){
	    if (deq.size() > 0){
		deq.addFirst(coor);
	    } else {
		deq.addLast(coor);
	    }
	} else {
	    deq.push(coor);
	}
    }
       
	    
	    

    
	
    