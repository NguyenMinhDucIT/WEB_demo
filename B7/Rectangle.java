package B7;

public class Rectangle extends Shape{
	protected double width;
	protected double length;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		
		return this.width * this.length;
	}
	@Override
	public double getParameter() {
		
		return (this.width + this.length) * 2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
