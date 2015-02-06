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
	return sqrtHelp(n, 1);
    }

    public double sqrtHelp(double n, double guess){
	if (n == 0){
	    return 0;
	}else if (guess * guess == n){
	    return guess;
	}else{
	    return sqrtHelp(n, (n / guess + guess) / 2);
	}
    }
    
    public static void main(String[]args){
	Recursion x = new Recursion();
	System.out.println(x.fib(6));

    }
    
   
}
