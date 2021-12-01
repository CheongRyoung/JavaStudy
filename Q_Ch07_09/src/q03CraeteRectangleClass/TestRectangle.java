package q03CraeteRectangleClass;

//• 2개 Rectangle 인스턴스 만들기 (1개는 width 4, height 40이고, 2번
//째는 width 3.5, height 35.9 만들기)
//• 2개 인스턴스의 정보 출력하기 (width, height, area, perimeter)
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 4;
		r1.height = 40;
				
		System.out.println("width = " + r1.width + ", height = " + r1.height + " ,area = "
		+ r1.getArea() + " , perimeter = " + r1.getPerimeter());
			
		Rectangle r2 = new Rectangle();
		r2.width = 3.5;
		r2.height = 35.9;
		
		
		System.out.println("width = " + r2.width + ", height = " + r2.height + " ,area = "
		+ r2.getArea() + " , perimeter = " + r2.getPerimeter());
		

	}

}
