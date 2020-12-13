package B7;

public class Square extends Rectangle{
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square() {
		
	}
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	@Override
	public void setWidth(double side) {
		// TODO Auto-generated method stub
		super.setWidth(side);
	}
	@Override
	public void setLength(double side) {
		// TODO Auto-generated method stub
		super.setLength(side);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
