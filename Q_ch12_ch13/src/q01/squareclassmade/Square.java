package q01.squareclassmade;

public class Square extends GeometricObject implements Colorable {

	private double side;

	public Square() {
		this.side = 1.0;

	}

	public Square(double side) {
		super("black", false);
		this.side = side;
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side=side;
	}
	@Override
	public String howToColor() {

		return "모든 변을 색칠하기";
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return side*side;
	}
	
	public double getPerimeter() {
		return side*4;
	}

	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();

	}
}
