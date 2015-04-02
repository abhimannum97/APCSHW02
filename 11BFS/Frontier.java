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
	}
	if (mode == 2){
	    deq.push(coor);
	}
    }

    public void remove() throws NoSuchElementException{
	if (deq.size() < 1){
	    throw new NoSuchElementException();
	}
	if (mode == 1){
		deq.remove();
	}
	if (mode == 2){
	    deq.pop();
	}
    }

}
	   
	    

    
       
	    
	    

    
	
    