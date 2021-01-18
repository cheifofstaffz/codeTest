
public class Square implements Shape {

	
	int number;
	
	public Square(int n) {
	number = n;
	}
	
	@Override
	public int perimeter() {
		return 4*number;
	}

	@Override
	public int area() {
		
		return number*number;
	}

}
