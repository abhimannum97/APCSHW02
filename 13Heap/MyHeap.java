
public class MyHeap{

    int[] heap;
    int root;
    
    public MyHeap(){
	heap = new int[10];
	root = 1;
    }
    
    public boolean isEmpty(){
	int i = 0;
	while ( i < heap.length){
	    if (heap[i] != null){
		return false;
	    }
	    i++;
	}
	return true;
    }

    public boolean isEmpty(int ind){
	if (heap[ind] != null){
	    return false;
	}
	return true;
    }

    public void add(int k){
	if (isEmpty()){
	    heap[root] = k;
	}
	int i = 0;
	while (!isEmpty(i)){
	    i++;
	}
	heap[i] = k;
	
