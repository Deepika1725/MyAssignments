package week1.day2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		

	       
	        int n = 8;

	        int first = 0, second = 1;
	        System.out.print("Enter the number of terms in Fibonacci series: ");

	        System.out.print("Fibonacci Series: ");

	        for (int i = 1; i <= n; i++) {
	            System.out.print(first + " ");
	            int next = first + second;
	            first = second;
	            second = next;
	        }

	        
	    }
	
	

}

