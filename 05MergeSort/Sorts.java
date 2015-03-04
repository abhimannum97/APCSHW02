import java.util.*;

public class Sorts{

    private static ArrayList<Comparable> A;
    private static ArrayList<Comparable> B;

    public static void mergesort(int[] ary){
	A = new ArrayList<Comparable>();
	B = new ArrayList<Comparable>();
	for (int a : ary){
	    A.add(ary[i]);
	}
	
	mhelp(A);
	
	int start = 0;
	while(A.size() > 0){
	    ary(start) = (int)A.remove(0);
	    start++;
	}
    }
	    
}
