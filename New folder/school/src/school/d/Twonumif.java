package school.d;

import java.util.Scanner;

public class Twonumif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum, sub, mul;
		Scanner input = new Scanner(System.in);
		
	    System.out.println("enter a first number");
		     num1 = input.nextInt();
		
	    System.out.println("enter a second number");
		     num2 = input.nextInt();
	 if (num1 > num2) {
		     sum = num1 + num2;
        System.out.println("the sum = " + sum);
		 }
	 
	 else if  (num1 < num2)
	 { 
		     sub = num1 - num2;
	    System.out.println("the subtraction =" + sub);
	 }
	 
	 else if (num1 == num2)
	 {
		      mul = num1 * num2;
	    System.out.println("the multiplication =" + mul);
	 }
     else	
	    System.out.println("the division is not possible");
		input.close();

	}

}
