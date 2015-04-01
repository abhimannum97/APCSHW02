import java.util.*;

public class MyDeque<T>{

    private Object[] deq;
    private int head, tail, size;

    public MyDeque(int s){
	deq = new Object[s];
	head = 0;
	tail = 0;
    }
    
    public MyDeque(){
	this(10);
    }

    public T getFirst(){
	return (T)deq[head];
    }

    public T getLast() throws NoSuchElementException{
	return (T)deq(tail);
    }
    
    public void addFirst(T value){
	
    }

    public void addLast(T value){

    }

    public T removeFirst() throws NoSuchElementException{

    }

    public T removeLast() throws NoSuchElementException{

    }

    public Object[] resize(){
	Object[] ary = new Object[size*2];
	int ind = 0;
	(while head < size){
	    ary[ind] = deq[head];
	    ind++;
	    head++;
	}
	if (deq[0] != null){
	    int i = 0;
	    (while i < tail+1)
	    
	}
    }
}
	
