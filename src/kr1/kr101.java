package kr1;

public class kr101 {

	public static void main(String[] args) {
		
		double  x;
		double  y;
		double  z;
		double  a;
		double  b;
		
		x = 2;
		y = 4;
		
		
        a = 1+Math.sin(x+y)*Math.sin(x+y);
        
        b = 2+Math.abs(x-(2*x)/(1+x*x*y*y));
        
        z = a/b+x;
        
        System.out.println("z = " + z);
	}

}
