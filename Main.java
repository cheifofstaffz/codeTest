
public class Main {

	public static void main(String[] args) {
		
		
		//FizzBuzz
		
		FizzBuzz I = new FizzBuzz();
		I.doFizzBuzz();
	
		//Check if string is reversed
		Reverse R = new Reverse();
		System.out.println("Is the reverse of 'abc' 'cba' ? " + R.isReverse("abc", "cba"));
		System.out.println("Is the reverse of 'abc' 'xyz' ? " + R.isReverse("abc", "xyz"));
		
		// Perimeter and area of square Given a side
		int number = 5;
		Square S = new Square(number);
		System.out.println("Given a side of a square: " + number +  " The perimeter is "+
		S.perimeter() +" The area is " + S.area());
		
		// Fibonacci Sequence
		Fib F = new Fib();
		System.out.println("The following are the results from Fibonacci: ");
		System.out.println(F.getFibonacci(0));
		System.out.println(F.getFibonacci(1));
		System.out.println(F.getFibonacci(2));
		System.out.println(F.getFibonacci(3));
		System.out.println(F.getFibonacci(4));
		// Testing for Prime
		Prime P = new Prime();
		
		System.out.println("Is 5 prime ?: " + P.isPrime(5));
		System.out.println("Is 6 prime ?: " + P.isPrime(6));
		

	}

}
