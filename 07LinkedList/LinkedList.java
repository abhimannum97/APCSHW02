import java.util.*;

public class LinkedList<T>{

    private LNode<T> node;
    private int size;

    public LinkedList(){
	size = 0;
    }

    public int size(){
	return size;
    }

    public T get(int index){
	LNode<T> current = node.getNext();
	int i = 0;
	while(i < index){
	    current = node.getNext();
	}
	return current.getData();
    }

    public int indexOf(int val){
	LNode<T> current = node;
	int ind = 0;
	while(current.getNext() != null){
	    if (val == current.getData()){
		return ind;
	    }
	}
	return -1;
	}
	
    public boolean add(int val){
	LNode<T> temp = node;
	if (size() == 0){
	    node = new LNode<T>(val);
	}else{
	    while(temp.getNext() != null){
		temp = this.getNext();
	    }
	    temp.setNext(new LNode<T>(val));
	}
	size++;
	return true;
    }

    public boolean add(int index, int value){
	LNode<T> temp = node;
	for (int i = 0; i < index; i++){
	    temp = temp.getNext();
	}
	temp.setNext(new LNode(value, current.getNext()));
	return true;
    }
   
    public T set(int ind, int val){
	LNode<T> current = node;
	int i = 0;
	while (i < ind){
	    current = current.getNext();
	}
	T temp = current.getData();
	current.setData(val);
	return temp;
    }

    public T remove(int ind){
	LNode<T> current = node;
	int i = 0;
	while (i < ind - 1){
	    current = current.getNext();
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

