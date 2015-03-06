import java.util.*;

public class QuickSelect{

    public String toString(int[] x){
	String ans = "";
	for (int i = 0; i < x.length; i++){
	    ans += x[i] + " ,";
	}
	return "[" + ans + "]";
    }

    public int[] partition(int[] ary, int start, int end){
	Random r = new Random();
	int si = start;
	int ei = end;
	int[] D = new int[ary.length];
	for (int i = 0; i < D.length; i++){
	    if (i < si || i > ei){
		D[i] = ary[i];
	    }
	}
	System.out.println(toString(ary));
	System.out.println(toString(D));
	int pivot = ary[r.nextInt(ei - si) + si];
	int i = start;
	while (si != ei){
	    if (ary[i] < pivot){
		D[si] = ary[i];
		si++;
		i++;
	    }else{
		D[ei] = ary[i];
		ei--;
		i++;
	    }
	}
	return D;
    }

    public static void main(String[]args){
	int[] A = new int[10];
	Random rand = new Random();
	for (int i = 0; i < A.length; i++){
	    A[i] = rand.nextInt(100);
	}
	
	QuickSelect qs = new QuickSelect();
        
	System.out.println(qs.toString(qs.partition(A, 4, 7)));
    }
	

}
