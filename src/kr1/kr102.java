package kr1;

import java.util.Scanner;

public class kr102 {

	public static void main(String[] args) {
		
		int n = 10;
		int q = 0;
		int w = 0;
		int sum = 0;
		int[] mas = new int[n];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� 10 ����� �����");
		for (int i = 0; i < mas.length; i++) {
			
		  System.out.println("������� ����� �����[" + i + "]=");
		  while (!sc.hasNextInt()) {
		   sc.nextLine();
		   
		    System.out.println("������� ����� �����[" + i + "]=");
		}
		   mas[i] = sc.nextInt();
		}
     for(int i = 0; i<mas.length; i++) {
		    	
		    	if (mas[i]<2) {
		    		q++;
		    	}
     }
		    System.out.println("<2   "+q);
		
     for(int i = 0; i<mas.length; i++) {
		    	
		    	if (mas[i]>15) {
		    		w++;
		    	}
		}
     System.out.println(">15   "+w);
		   
    for(int i = 0; i<mas.length; i++) {
 	
 	     if (mas[i]%5==4) {
 		    sum = 0+mas[i];
 	}
          
}
    System.out.println("sum=   "+sum);
	}

}
