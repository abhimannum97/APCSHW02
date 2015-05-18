import java.util.*;

public class QuickSelect{

    public String toString(int[] x){
	String ans = "";
	for (int i = 0; i < x.length; i++){
	    ans += x[i] + " ,";
	}
	return "[" + ans + "]";
    }

    /*
    public static void oldpartition(int[] ary, int si, int ei){
	System.out.println(Arrays.toString(ary));
	int[] D = new int[ary.length];
	int i = 0;
	while ( i < ary.length){  
	    if (i < si || i > ei){
		D[i] = ary[i];
	    }
	}
	int s = si;
	int e = ei;
	Random r = new Random();
	int ri = si + r.nextInt(ei-si+1);
	int p = ary[ri];
	System.out.println("pivot =" + pivot);
	System.out.println(Arrays.toString(D));
	i = si;
	while (i <= e){
	    if(ary[i] < p){
		D[si] = ary[i];
		si++;
	    }else if (ary[i] > p){
		D[ei] = ary[i];
		ei--;
	    }
	    i++;
	    System.out.println(Arrays.toString(D));
	}
	D[ri] = p;
	System.out.println(Arrays.toString(D));
    }
    */

    public static int partition(int[] ary, int si, int ei){
	System.out.println(Arrays.toString(ary));
	Random r = new Random();
	int ri = ary[si + r.nextInt(ei-si)];
	System.out.println("pivot = " + ri);
	int t = si;
	int holder;
	do {
	    if (ary[t] > ri){
		holder = ary[ei];
		ary[ei] = ary[t];
		ary[si] = holder;
		ei--;
	    }
	    if (ary[t] < ri){
		si++;
		t++;
	    }
	    if (ary[t] == ri){
		t++;
	    }
	    System.out.println(Arrays.toString(ary));
	} while (si != ei);
	ary[si] = ri;
	return si;
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
