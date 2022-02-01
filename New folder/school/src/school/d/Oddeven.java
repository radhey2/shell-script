package school.d;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		   num = input.nextInt();
		if (num % 2 == 0 )
			System.out.println("number is even");
		else 
			System.out.println("number is odd");
		input.close();
			
		// TODO Auto-generated method stub

	}

}
