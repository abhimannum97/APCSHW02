import java.util.*;

public class Sorts{

    public String name(){
	return "majumder. abhimannu";
    }

    public static void mergesort(int[]x){
	mergesort(x, 0, x.length);
    }

    public static void mergesort(int[]x, int low, int top){
	if (top - low >= 2){
	    mergesort(x, low, low + (top - low) / 2);
	    mergesort(x, low + (top - low) / 2, top);
	    order(x, low, low + (top - low) / 2, top);
	}
    }

    public static void order(int[]x, int low, int med, int max){
	int one = low;
	int two = med;
	int[]temp = new int[max - low];
	for (int i = 0; i < temp.length; i++){
	    if (one >= med){
		temp[i] = x[two];
		two++;
	    }else if (two >= max){
		temp[i] = x[one];
		one++;
	    }else{
		if (x[one] > x[two]){
		    temp[i] = x[two];
		    two++;
		}else{
		    temp[i] = x[one];
		    one++;
		}
	    }
	}
	for (int i = 0; i < temp.length; i++){
	    x[low + i] = temp[i];
	}
    }

   public static int[] randomize(int min, int max, int len){
	int[] a = new int[len];
	Random r = new Random();
	for(int i=0;i<len;i++){
	    a[i]=r.nextInt(max-min+1)+min;
	}
	return a;
    }

    public static String toString(int[] ary){
	String ans = "[ ";
	for (int i = 0; i < ary.length; i++){
	    ans += ary[i] + ", ";
	}
	ans += " ]";
	return ans;
    }

    public static void main(String[]dd){
	int[] a = randomize(0, 1000, 20);
        mergesort(a);
	System.out.println(toString(a));
    }

  
}


		
			
	    
	    
	
	
	    

