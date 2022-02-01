package school.d;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		double INR;
		double rupee = 0.013;
		double doller;
    Scanner input = new Scanner(System.in);
		
	    System.out.println("enter a first number");
		     INR = input.nextInt();
		    doller =( rupee * INR);
		     System.out.println("The value in dollar = " + doller);
		     input.close();
		

	}

}
