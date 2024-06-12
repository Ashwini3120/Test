package programs;

public class ExceptionClass {
//4.Write a Java program to create a method that takes an integer as a parameter 
//and throws an exception if the number is odd.
	public void getNumber(int n) {
		if(n%2==0) {
			System.out.println("The number is even");
		}
		else {
			throw new ArithmeticException("The number is odd");
		}
	}
	
	public static void main(String[] args) {
		ExceptionClass ex=new ExceptionClass();
		ex.getNumber(12);
		ex.getNumber(13);
	}

}
