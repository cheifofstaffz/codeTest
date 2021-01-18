public class Prime implements PrimeNumber {

	@Override
	public boolean isPrime(int number) {
		if(number <= 2) return false;
		boolean prime = true;

		for(int i = 2; i< number/2; i++) {
			if((number % i) == 0) {
				prime = false;
				break;
			}
		}	
		return prime;
	}

}
