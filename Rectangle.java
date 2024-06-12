package programs;

public class Rectangle {
	private int width;
	private int height;
	private double Rarea;
	
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public double calculateArea() {
		Rarea=width*height;
		return Rarea;
		
	}

}
