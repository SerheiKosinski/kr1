package kr1;

public class kr105 {

	public static void main(String[] args) {
		int[]mas={5,8,11,7,499,9,10,7,16,19};

		method(mas);
	}
	public static void method(int[]mas) {
		int x=0;
		int n=0;
	for (int i=0;i<mas.length;i++) {
			 if (mas[i]>x) {
				x=mas[i];
				System.out.println(mas[i]);
			} else {
				n++;
			  }
		    }
		    System.out.println("K=" + n);
	}

}
