package kr1;

import java.util.Scanner;
public class kr104 {

	public static void main(String[] args) {
	
		int n = 4;
		
		int[] mas = new int[n];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("введите 4 целых числа");
		for (int i = 0; i < mas.length; i++) {
			
		  System.out.println("введите целое число[" + i + "]=");
		  while (!sc.hasNextInt()) {
		   sc.nextLine();
		   
		    System.out.println("введите целое число[" + i + "]=");
		}
		   mas[i] = sc.nextInt();
		}
		method(mas);
	}
	public static void method(int[] array) {
		for (int i = 0; i < array.length; i++) {
		  if (array[i] % 2 != 0 && array[i] % 3 != 0 && array[i] % 5 != 0) {
		System.out.println("mas["+i+"]");
		
		}
		}
		
	}

}
