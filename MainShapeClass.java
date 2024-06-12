package programs;

public class MainShapeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c=new Circle(12);
		System.out.println("Area of Circle is "+c.calculateArea());
		
		Rectangle rc=new Rectangle(7,9);
		System.out.println("Area of Rectangle is "+rc.calculateArea());
		
		Triangle t=new Triangle(12,8);
		System.out.println("Area of Triangle is "+t.calculateArea());
		
	}

}
