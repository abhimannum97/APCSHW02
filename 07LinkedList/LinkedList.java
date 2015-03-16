import java.util.*;

public class LinkedList{

    private LNode node;
    private int size;

    public LinkedList(){
	size = 0;
    }

    public int size(){
	return size;
    }

    public int get(int index){
	LNode current = node.getNext();
	int i = 0;
	while(i < index){
	    current = node.getNext();
	}
	return current.getData();
    }

    public int indexOf(int val){
	LNode current = node;
	int ind = 0;
	while(current.getNext() != null){
	    if (val == current.getData()){
		return ind;
	    }
	}
	return -1;
	}
	
    public boolean add(int val){
	LNode temp = node;
	if (temp.size() == 0){
	    node = new LNode(val);
	}else{
	    while(temp.getNext() != null){
		temp = this.getNext();
	    }
	    temp.setNext(new LNode(val));
	}
	size++;
	return true;
    }

    public boolean add(int index, int value){
	LNode temp = node;
	for (int i = 0; i < index; i++){
	    temp = temp.getNext();
	}
	temp.setNext(new LNode(value, current.getNext()));
	return true;
    }
   
    public int set(int ind, int val){
	LNode current = node;
	int i = 0;
	while (i < ind){
	    current = current.getNext();
	}
	int temp = current.getData();
	current.setData(val);
	return temp;
    }

    public int remove(int ind){
	LNode current = node;
	int i = 0;
	while (i < ind - 1){
	    current = current.getNext();
	}
	int x = current.getNext().getData();
	current.setNext(current.getNext().getNext());
	return x;
    }
    
    

}

