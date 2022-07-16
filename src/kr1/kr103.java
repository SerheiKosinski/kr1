package kr1;

public class kr103 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double y;
		a = 2;
		b = 6;
		h = 0.2;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		for(double x = a; x <=b; x = x + h) {
		y = Math.tan(x);
		System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");

	}

}
