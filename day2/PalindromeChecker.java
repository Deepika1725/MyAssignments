package week1.day2;

public class PalindromeChecker {

	public static void main(String[] args) {
		 int originalNumber = 1221; // You can change this value to test other numbers
	        int reversedNumber = 0;
	        int temp = originalNumber;

	        while (temp != 0) {
	            int digit = temp % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            temp /= 10;
	        }

	        if (originalNumber == reversedNumber) {
	            System.out.println(originalNumber + " is a Palindrome.");
	        } else {
	            System.out.println(originalNumber + " is not a Palindrome.");
	        }
	    }
	
	}


