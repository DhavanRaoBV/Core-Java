package Shape;

public class Circle extends Shape{
	float radius;
	float area;
	
	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
		
	}
	
	
	public float getRadius() {
		return radius;
	}


	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public void findArea() {
	 area=(float)3.14*radius*radius;
	}


	
}
