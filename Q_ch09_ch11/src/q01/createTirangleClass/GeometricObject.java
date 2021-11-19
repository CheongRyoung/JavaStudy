package q01.createTirangleClass;

public class GeometricObject {
	private String color;
	boolean filled;
	
	public GeometricObject() {
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public double getArea() {
		return 1.0;
	}
	
	public double getPerimeter() {
		return 1.0;
}
	
	public String toString() {
		return "정의되지 않았습니다.";
	}
}
