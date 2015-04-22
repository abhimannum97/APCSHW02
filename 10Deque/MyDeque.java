import java.util.*;

public class MyDeque<T>{

    private Object[] deq;
    private int head, tail, size, capacity;

    public MyDeque(int s){
	deq = new Object[s];
	head = 0;
	tail = 0;
	capacity = 0;
	size = s;
    }
    
    public MyDeque(){
	this(10);
    }

    public T getFirst(){
	return (T)deq[head];
    }

    public T getLast(){
	return (T)deq[tail];
    }

    public void copy(int adv){
	Object[] temp = new Object[size];
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

    public void add(int ind, T value){
	if (isEmpty()){ //tail == deq.length - 1){
	    deq[0] = value;
	    tail = 0;
	} else if (ind < 0){
	    deq[deq.length - 1] = value;
	}else{
	    deq[ind] = value;
	}
	capacity++;
    }
	
	
    
    public void addFirst(T value){
	if (isEmpty()){
	    head = 0;
	}else if (head == 0){
	    head = deq.length - 1;
	}else{
	    head -= 1;
	}
	add(head,value);
	capacity++;
	resize();
    }
	    
	
    public void addLast(T value){
	if (tail == deq.length - 1){
	    tail = 0;
	}else{ 
	tail++;
	}
	add(tail,value);
	resize();
    }
    
    public T removeFirst() throws NoSuchElementException{
	T value = (T)deq[head];
	if (isEmpty()){
	    throw new NoSuchElementException();
	} else if (capacity == 1){
	    add(head, null);
	    head = 0;
	    tail = 0;
	    capacity--;
	}
	add(head,null);
	head++;
	capacity--;
       	resize();
	return value;
    }

    public T removeLast() throws NoSuchElementException{
	T value = (T)deq[tail];
	if (isEmpty()){
	    throw new NoSuchElementException();
	} else {
	    deq[tail] = null;
	    tail--;
	    capacity--;
	    resize();
	    return value;
	}
    }
    
    public boolean wrap(){
	if (deq[deq.length - 1] != null && deq[0] != null){
	    return true;
	}else 
	    return false;
    }

    public boolean resize(){
	boolean run = false;
	Object[] ary = new Object[size];
	if (capacity > size/2){
	    ary = new Object[size*2];
	    size = size * 2;
	    run = true;
	}
	if (capacity < size / 4){
	    ary = new Object[size/2];
	    size = size/2;
	    run = true;
	}
	if (run){
	    int head_1 = head;
	    int x = 0;
	    if (this.wrap()){
		for (int i = head_1; i < deq.length; i++){
		    ary[x] = deq[i];
		    x++;
		}
	    }
	    for (int i = 0; i < tail+1; i++){
		ary[x] = deq[i];
		x++;
	    }
	    deq = ary;
	}
	return run;
    }
		    
    public String toString(){
	String str = "[ ";
	for (int i = 0; i < deq.length; i++){
	    str += deq[i] + ",";
	}
	return str + " ]";
    }

    public boolean isEmpty(){
	if (capacity == 0){
	    return true;
	}else
	    return false;
    }
    	
    
}
	
