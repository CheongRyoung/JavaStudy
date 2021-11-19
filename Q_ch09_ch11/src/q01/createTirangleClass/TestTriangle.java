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
		
		GeometricObject geo1 = new Triangle(side1, side2, side3);
		geo1.setColor(color);
		geo1.setFilled(filled);
		
		System.out.println("toString() = " + geo1.toString() + ", getArea() = " + geo1.getArea() +
				", getPerimeter() = " + geo1.getPerimeter() + ", getColor() = " + geo1.getColor() + 
				", isFilled() = " + geo1.isFilled());
		
		GeometricObject geo2 = new Triangle();
		geo2.setColor(color);
		geo2.setFilled(filled);
		
		System.out.println("toString() = " + geo2.toString() + ", getArea() = " + geo2.getArea() +
				", getPerimeter() = " + geo2.getPerimeter() + ", getColor() = " + geo2.getColor() + 
				", isFilled() = " + geo2.isFilled());
		
	}

}
