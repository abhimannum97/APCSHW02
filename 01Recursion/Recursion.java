public class Recursion{

    public String name(){
	return "Abhimannu Majumder";
    }

    public int fact(int n){
	if (n == 1){
	    return 1;
	}
	return n * fact(n-1);
    }

    public int fib(int n){
	if (n == 0){
	    return 0;
	}
	if (n == 1){
	    return 1;
	}
	return fib(n-1) + fib(n-2);
    }
    
    public static void main(String[]args){
	Recursion x = new Recursion();
	System.out.println(x.fib(6));

    }
}
