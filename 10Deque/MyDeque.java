import java.util.*;

public class MyDeque<T>{

    private Object[] deq;
    private int head, tail, size, capacity;

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

    public void add(T value){
	if (isEmpty() || tail == deq.length - 1){
	    deq[0] = value;
	    tail = 0;
	}else{
	    tail++;
	    deq[tail] = value;
	}
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
	
	
    /*
    public void addLast(T value){

    }

    public T removeFirst() throws NoSuchElementException{

    }

    public T removeLast() throws NoSuchElementException{

    }
    

    public Object[] resize(){
	Object[] ary = new Object[size*2];
	int ind = 0;
	while (head < size){
	    ary[ind] = deq[head];
	    ind++;
	    head++;
	}
	if (deq[0] != null){
	    int i = 0;
	    while (i < tail+1)
	    
	}
    }
    */

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
	
	MyDeque<T> test = new MyDeque();
	
	test.add(0);
	test.add(1);
	test.add(2);
	test.add(3);
	System.out.println(test.toString());
	test.addFirst(2);
	System.out.println(test.toString());

    }
	
	

    
}
	
