public class LNode<T>{
    
    private T data;
    private LNode<T> next;

    public LNode(T newData){
	data = newData;
	next = null;
    }
    
    public LNode(T newData, LNode newNext){
	this.setData(newData);
	this.setNext(newNext);
    }
    
    public T getData(){
	return data;
    }
    
    public void setData(T newData){
	data = newData;
    }

    public LNode<T> getNext(){
	return next;
    }

    public void setNext(LNode<T> newNext){
	next = newNext;
    }

    public String toString(){
	return "[ " + data + " ]";
    }
}
			     
