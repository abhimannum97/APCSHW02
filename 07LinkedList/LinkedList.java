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
	temp.setNext(new LNode(cal, current.getNext()));
	return true;
    }
    
}
