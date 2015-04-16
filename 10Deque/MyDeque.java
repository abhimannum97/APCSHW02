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

    public void copy(int adv){
	int[] temp = new int[size];
	int start = head;
	while(start != tail+1){
	    if (start == size - 1){
		start = 0;
	    }
	    if (start == 0){
		temp[size-1] = deq[start];
		start++;
	    }else{
		temp[start+adv] = deq[start];
		start++;
	    }
	}
	head = head + adv;
	tail = tail + adv;
	deq = temp;
    }
    
    public void addFirst(T value){
	copy(1);
	if (head != 0){
	    head = head - 1;
	}else{
	    head = size - 1;
	}
	deq[head] = value;
    }
	
	
	
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
	
