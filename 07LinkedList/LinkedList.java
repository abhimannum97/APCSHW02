import java.util.*;

public class LinkedList<T> implements Iterator<T>{

    private LNode<T> first, current, last;
    private LLIterator<T> iter;
    private int size;

    private class LLIterator<T> implements Iterator<T>{
	private LNode<T> n;

	public LLIterator(LNode<T> first){
	    n = first;
	}

	public boolean hasNext(){
	    return n.getNext() != last;
	}

	public T next(){
	    T data = n.getData();
	    n = n.getNext();
	    return data;
	}
	
	public void remove() throws UnsupportedOperationException{
	    throw new UnsupportedOperationException();
	}
    }

    public LinkedList(){
	current = null;
	last = current;
	size = 0;
    }

    public String name(){
	return "majumder, abhimannu";
    }


    public int size(){
	return size;
    }

    public T get(int index){
	if (index >= size() || index < 0){
	    throw new IndexOutOfBoundsException();
	}
	current = first;
	int i = 0;
	while(i < index){
	    current = node.getNext();
	    i++;
	}
	return current.getData();
    }

    public int indexOf(T val){
	int ind = 0;
	current = first;
        for (int i = 0; i < size; i++){
	    if (current.getData().equals(val)== true){
		return i;
	    }
	}
	return -1;
	}
	

    public boolean add(int index, T value){
	if (ind < 0 || ind >= size){
	    return false;
	}else if (size == 0){
	    first = new LNode<T>(value);
	    last = first;
	} else {
	current = first;
	int i = 0;
	while (i < index){
	    current = temp.getNext();
	    i++;
	}
	current.setNext(new LNode<T>(value, temp.getNext()));
	}
	size++;
	return true;
    }

    public add(T value){
	return add(size, value);
    }
   
    public T set(int ind, T val)throw IndexOutOfBoundsException{
	if (ind < 0 || ind >= size()){
	    throw new IndexOutOfBoundsException();
	}
	current = first;
	int i = 0;
	while (i < ind){
	    current = current.getNext();
	    i++;
	}
	T temp = current.getData();
	current.setData(val);
	return temp;
    }

    public T remove(int ind) throws IndexOutOfBoundsException{
	if (ind < 0 || ind >= size()){
	    throw new IndexOutOfBoundsException();
	}
	current = first;
	int i = 0;
	while (i < ind - 1){
	    current = current.getNext();
	    i++;
	}
	T x = current.getNext().getData();
	current.setNext(current.getNext().getNext());
	return x;
    }

    public static void main(String [] args){
	
	LinkedList test = new LinkedList();
	
	test.add(2);
	test.add(3);
	test.add(4);
    }
    
    

}

