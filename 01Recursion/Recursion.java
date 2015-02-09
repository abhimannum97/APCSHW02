public class Recursion{

    public String name(){
	return "Abhimannu Majumder";
    }

    public int fact(int n){
	if (n < 0){
	    throw new IllegalArgumentException();
	}
	if (n == 1){
	    return 1;
	}
	return n * fact(n-1);
    }

    public int fib(int n){
	if (n < 0){
	    throw new IllegalArgumentException();
	}
	if (n == 0){
	    return 0;
	}
	if (n == 1){
	    return 1;
	}
	return fib(n-1) + fib(n-2);
    }
    
       public double sqrt(double n){
	if (n < 0){
	    throw new IllegalArgumentException();
	}
	return help(n, 1);
    }

    public double help(double n, double g){
	if (n == 0){
	    return 0;
	}else if (g * g == n){
	    return g;
	}else{
	    return help(n, (n / g + g) / 2);
	}
    }
    
    public static void main(String[]args){
	Recursion x = new Recursion();
	System.out.println(x.fib(6));

    }
    
   
}
