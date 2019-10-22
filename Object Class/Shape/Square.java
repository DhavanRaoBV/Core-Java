package Shape;

public class Square extends Shape {
	
	float side;
	float area;
	
	
	public Square(float side, float area) {
		super();
		this.side = side;
		
	}
	
	
	public float getSide() {
		return side;
	}


	public void setSide(float side) {
		this.side = side;
	}


	public void findArea() {
		area=side*side;
	}
	
	
	
	
}
	
	