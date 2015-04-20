import java.util.*;

public class MyDeque<T>{

    private Object[] deq;
    private int head, tail, size, capacity;

    public MyDeque(int s){
	deq = new Object[s];
	head = 0;
	tail = 0;
	capacity = 0;
	size = 0;
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
	if (head == 0){
	    head = deq.length - 1;
	}else{
	    head -= 1;
	}
	add(head,value);
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

    public Object[] resize(){
	boolean run = false;
	Object[] ary;
	if (capacity > size/2){
	    ary = new Object[size*2];
	    size = size * 2;
	    run = true;
	}else if (capacity < size / 4){
	    ary = new Object[size/2];
	    size = size/2;
	    run = true;
	}
	if (run){
	    if (wrap()){
		int head_1 = head;
		int head_2 = ary.length - (deq.length - tail);
		for (int i = head_2; i < ary.length; i++){
		    ary[i] = deq[head_1];
		    head_1++;
		}
		for (int i = 0; i < tail+1;i++){
		    ary[i] = deq[i];
		}
	    }else{
		for (int i = head; i < tail+1; i++){
		    ary[i] = deq[i];
		}
	    }
	}
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
    
    public static void main(String [] args){
	
	MyDeque test = new MyDeque();
	
	test.add(0);
	test.add(1);
	test.add(2);
	test.add(3);
	System.out.println(test.toString());
	test.addFirst(2);
	System.out.println(test.toString());

    }
	
	

    
}
	
