package q01.createTirangleClass;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("삼각형 세 변을 입력해주세요");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("색상을 입력해주세요");
		String color = input.next();
		
		System.out.println("filled 여부를 알려주세요");
		boolean filled = input.nextBoolean();
		
		GeometricObject geo = new Triangle(side1, side2, side3);
		geo.setColor(color);
		geo.setFilled(filled);
		
		System.out.println("toString() = " + geo.toString() + ", getArea() = " + geo.getArea() +
				", getPerimeter() = " + geo.getPerimeter() + ", getColor() = " + geo.getColor() + 
				", isFilled() = " + geo.isFilled());
				
	}

}
