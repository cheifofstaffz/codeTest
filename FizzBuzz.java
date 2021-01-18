
public class FizzBuzz implements IFizzBuzz{

	@Override
	public void doFizzBuzz() {
		
		for(int i = 1; i <= 500; i++) {
            if(i % 6 == 0 && i % 10 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 6 == 0) {
                System.out.println("Fizz");
            } else if(i % 10 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
	}

}
