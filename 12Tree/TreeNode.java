import java.util.*;

public class TreeNode<E>{

    T data;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E value){
	data = value;
	left = null;
	right = null;
    }

    public TreeNode<E>(){
	this(null);
    }

    public T getData(){
	return data;
    }

    public TreeNode<E> getLeft(){
	return left;
    }
    
    public TreeNode<E> getRight(){
	return right;
    }

    public void set(E value){
	data = value;
    }
    
    public void setLeft(TreeNode<E> value){
	left = value;
    }

    public void setRight(TreeNode<E> value){
	right = value;
    }

    public boolean hasNext(){
	return hasLeft() || hasRight();
    }
    
    public boolean hasLeft(){
	return left != null;
    }

    public boolean hasRight(){
	return right != null;
    }

}

	

    

    
	
	    
