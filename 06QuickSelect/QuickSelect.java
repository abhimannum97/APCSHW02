import java.util.*;

public class QuickSelect{

    public String toString(int[] x){
	String ans = "";
	for (int i = 0; i < x.length; i++){
	    ans += x[i] + " ,";
	}
	return "[" + ans + "]";
    }

    public static void partition(int[] ary, int si, int ei){
	System.out.println(Arrays.toString(ary));
	/*int[] D = new int[ary.length];
	for (int i = 0; i < ary.length; i++){
	    if (i < si || i > ei){
		D[i] = ary[i];
	    }
	}
	*/
	int start = si;
	int end = ei;
	int ri = si + (int)(Math.random() * (ei - si + 1));
	int pivot = ary[ri];
	System.out.println("pivot =" + pivot);
	System.out.println(Arrays.toString(ary));
	int holder = 0;
	for (int i = start; i <= end; i++){
	    if (si != ei){
	    if(ary[i] < pivot){
		holder = ary[si];
		ary[si] = ary[i];
		ary[i] = holder;
		si++;
	    }else if (ary[i] > pivot){
		holder = ary[ei];
		ary[ei] = ary[i];
		ary[i] = holder;
		ei--;
	    }
	    }
	     System.out.println(Arrays.toString(ary));
	}
       
	System.out.println(Arrays.toString(ary));
    }

    public static int quickSelect(int ary[], int n){
	return 4;
    }
    
    public static void main(String[]args){
	int[] A = new int[10];
	Random rand = new Random();
	for (int i = 0; i < A.length; i++){
	    A[i] = rand.nextInt(100);
	}
	
	QuickSelect qs = new QuickSelect();
        
	qs.partition(A, 0, 9);
    }
	

}
