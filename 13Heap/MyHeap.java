import java.util.*;

public class MyHeap{

    int[] heap;
    int root, index, length;
    
    public MyHeap(){
	heap = new int[10];
	root = 1;			      
	index = 1;
	length = 0;
    }
    
    public boolean isEmpty(){
	int i = 0;
	while ( i < heap.length){
	    if (heap[i] != 0){
		return false;
	    }
	    i++;
	}
	return true;
    }

    public boolean isEmpty(int ind){
	if (heap[ind] != 0){
	    return false;
	}
	return true;
    }

    public int getRight(){
	if (isEmpty(index)){
	    return -1;
	}
	index = 2 * index;
	return index;
    }
    
    public int getLeft(){
	if (isEmpty(index)){
	    return -1;
	}
	index = 2 * index + 1;
	return index;
    }

    public int getParent(int ind){
	return ind / 2;
    }
    
    public String toString(){
	String str = "";
	for (int i = 0; i <= length; i++){
	    str += heap[i];
	}
	return str;
    }

    public peek(){
	return heap[1];
    }
	
    public void add(int k){
	length++;
	if (isEmpty()){
	    heap[index] = k;
	} else {
	    heap[index] = k;
	}
	pushUp(index);
	index++;
    }
    
    public void pushUp(int ind){
	int temp = ind;
	while (getParent(temp) < heap[ind]){
	    temp = getParent(temp);
	    

    public static void main(String[]args){
	
	MyHeap heap = new MyHeap();

}
