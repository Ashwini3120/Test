package programs;

public class Triangle {
	private int base;
	private int height;
	private double TArea;
	
	public Triangle(int base,int height) {
		this.base=base;
		this.height=height;
	}
	
	public double calculateArea() {
		TArea=0.5*(base*height);
		return TArea ;
	}

}
