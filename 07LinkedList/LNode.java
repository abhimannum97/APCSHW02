public class LNode{
    
    private int data;
    private LNode next;

    public LNode(int newData){
	data = newData;
	next = null;
    }
    
    public LNode(int newData, LNode newNext){
	this.setData(newData);
	this.setNext(newNext);
    }
    
    public int getData(){
	return data;
    }
    
    public void setData(int newData){
	data = newData;
    }

    public LNode getNext(){
	return next;
    }

    public void setNext(LNode newNext){
	next = newNext;
    }

    public String toString(){
	return "[ " + data + " ]";
    }
}
			     
