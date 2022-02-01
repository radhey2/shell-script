package school.d;

import java.util.Scanner;

public class Largestnum {
	public static void main(String[] args) {
		double  num1, num2;
        Scanner input = new Scanner(System.in);
		
	    System.out.println("enter a first number");
		     num1 = input.nextInt();
		
	    System.out.println("enter a second number");
		     num2 = input.nextInt();
		System.out.println("the largest of two number is" + Math.max(num1, num2));
		input.close();
		     
		
	}

}
