import java.util.*;

public class MyDeque{

    private Object[] deq;
    private int head, tail, size;

    public void addFirst(T value){
    
    }

    public void addLast(T value){

    }

    public T removeFirst() throws NoSuchElementException{

    }

    public T removeLast() throws NoSuchElementException{

    }

    public T getFirst() throws NoSuchElementException{

    }

    public T getLast() throws NoSuchElementException{

    }

    public Object[] resize(){
	Object[] ary = new Object[size*2];
	int ind = 0;
	(while head < size){
	    ary[ind] = deq[head];
	    ind++;
	    head++;
	}
	if (deq[tail] != null){
	    
	}
    }
}
	