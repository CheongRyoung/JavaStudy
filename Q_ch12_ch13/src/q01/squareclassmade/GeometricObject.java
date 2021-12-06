package q01.squareclassmade;

public class GeometricObject {
	String color;
	boolean filled;
	
	public GeometricObject() {
		
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String toString() {
		return "color: " + color + ", filled: " + filled;
	}
}
