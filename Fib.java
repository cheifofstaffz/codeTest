
public class Fib implements Fibonacci {

	@Override
	public int getFibonacci(int n) {
		if(n < 0) return -1;
		if (n < 2) return n;
	    return getFibonacci(n - 1) + getFibonacci(n - 2);
	}
	
}
