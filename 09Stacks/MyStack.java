import java.util.*;

public class MyStack<T>{

    private LinkedList stack;

    public MyStack(){
	stack = new LinkedList();
    }

    public String name(){
	return "majumder,abhimannu";
    }

    public T push(T val){
	stack.add(0,val);
	return val;
    }

    public T pop(){
	return stack.remove(0);
    }

    public T peek(){
	return stack.get(0);
    }

    public boolean isEmpty(){
	return stack.size() == 0;
    }
}
