import java.util.*;

public class MyQueue extends LinkedList{

    LinkedList queue;

    public String name(){
	return "majumder.abhimannu";
    }

    public MyQueue(){
	queue = new LinkedList();
    }
    
    public boolean enqueue(T n){
	if (queue.size() == 0){
	    queue.add(n);
	}else{
	    queue.add(n, queue.size());
	}
	return true;
    }

    public T dequeue(){
	return queue.remove(0);
    }
}	
	    
	
