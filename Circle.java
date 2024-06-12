package programs;

public class Circle extends Shape {
private int Area;
private int radius;

public Circle(int radius) {
	this.radius=radius;
}
	public double calculateArea() {
		Area=radius*radius;
		return Area;
				
	}
}
