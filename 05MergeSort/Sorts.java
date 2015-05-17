import java.util.*;

public class Sorts{

    public String name(){
	return "majumder. abhimannu";
    }
    
    public static ArrayList<Integer> copy(int[] ary){
	ArrayList<Integer> ans = new ArrayList<Integer>();
	for (int i = 0; i < ary.length; i++){
	    ans.add(ary[i]);
	}
	return ans;
    }
	    

    public static void mergesort(int[] x){
	ArrayList<Integer> one = new ArrayList<Integer>();
	ArrayList<Integer> two = new ArrayList<Integer>();
	one = copy(x);
	two = order(one);
	System.out.println(two);
    }

    public static ArrayList<Integer> order(ArrayList<Integer> z){
	ArrayList<Integer> ans = new ArrayList<Integer>();
	//	ArrayList<Integer> x = new ArrayList<Integer>();
	//	ArrayList<Integer> y = new ArrayList<Integer>();
	if (z.size() == 1){
	    return z;
	} else {
	    ArrayList<Integer> x = order(new ArrayList<Integer>(z.subList(0, z.size()/2)));
	    ArrayList<Integer> y = order(new ArrayList<Integer>(z.subList(z.size()/2, z.size())));
	    // while (x.size() > 0 && y.size() > 0){
	    while (x.size() > 0 && y.size() > 0){
		if (x.get(0) <= y.get(0)){
		    z.add(x.remove(0));
		} else if (y.get(0) <= x.get(0)){
		    z.add(y.remove(0));
		}
	    } // while (x.size() > 0 && y.size() > 0);
	    if (x.size() > 0 || y.size() > 0){
		if (!(x.isEmpty())){
		    z.addAll(x);
		} else {
		    z.addAll(y);
		}
	    }
	}
	return z;
    }

    public static String toString(int[] ary){
	String ans = "[ ";
	for (int i = 0; i < ary.length; i++){
	    ans += ary[i] + ", ";
	}
	ans += " ]";
	return ans;
    }

  
}


		
			
	    
	    
	
	
	    

