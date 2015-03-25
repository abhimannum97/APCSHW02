import java.util.*;

public class MyLinkedList<T> implements Iterable<T>{

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

    public MyLinkedList(){
	current = null;
	last = current;
	size = 0;
    }

    public Iterator<T> iterator(){
	return new LLIterator<T>(first);
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
	    current = current.getNext();
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
	if (index < 0 || index >= size){
	    return false;
	}else if (size == 0){
	    first = new LNode<T>(value);
	    last = first;
	} else {
	current = first;
	int i = 0;
	while (i < index){
	    current = current.getNext();
	    i++;
	}
	current.setNext(new LNode<T>(value, current.getNext()));
	}
	size++;
	return true;
    }

    public boolean add(T value){
	return add(size, value);
    }
   
    public T set(int ind, T val) throws IndexOutOfBoundsException{
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
	if (ind == 0){
	    first = first.getNext();
	}
	if (size == 0){
	    first = null;
	}
	int i = 0;
	while (i < ind - 1){
	    current = current.getNext();
	    i++;
	}
	T x = current.getNext().getData();
	current.setNext(current.getNext().getNext());
	return x;
    }

     public String toString(){
	String str = "[";
	current = first;
	while (current != null){
	    str += current.getData() + ",";
	    current = current.getNext();
	}
	return str.substring(0, str.length() - 1) + "]";
    }

     public boolean isEmpty(){
	return size == 0;
    }

    public static void main(String [] args){
	
	MyLinkedList<Integer> test = new MyLinkedList<Integer>();
	
	test.add(2);
	test.add(3);
	test.add(4);
	System.out.println(test.toString());

    }
    
    

}

