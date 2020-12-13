package B7;

public class Circle extends Shape{
	protected double radius;
	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		
		return radius*radius*Math.PI;
	}

	@Override
	public double getParameter() {
		
		return 2*radius*Math.PI;
	}

	@Override
	public String toString() {
		
		return null;
	}

	
}
