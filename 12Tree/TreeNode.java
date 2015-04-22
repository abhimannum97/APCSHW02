import java.util.*;

public class TreeNode<T>{

    T data;
    TreeNode<T> left = null;
    TreeNode<T> right = null;

    public TreeNode(T value, TreeNode<T> l, TreeNode<T> r){
	data = value;
	left = l;
	right = r;
    }

    public T getData(){
	return data;
    }

    public TreeNode<T> getLeft(){
	return left;
    }
    
    public TreeNode<T> getRight(){
	return r;
    }

    public add(T data){
	if (this.getData() ==  null){
	    