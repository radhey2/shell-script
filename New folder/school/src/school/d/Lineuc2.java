package school.d;

import java.util.Scanner;

public class Lineuc2 {

	public static void main(String[] args) {
		int  b1, b2, a1, a2, c1, c2;
		Scanner input = new Scanner (System.in);
		System.out.println("enter a point a1");
		a1  = input.nextInt();
		System.out.println("enter a point a2");
		a2  = input.nextInt();
		System.out.println("enter a point b1");
		b1  = input.nextInt();
		System.out.println("enter a point by");
		b2  = input.nextInt();
		System.out.println("enter a point c1");
		c1  = input.nextInt();
		System.out.println("enter a point c2");
		c2  = input.nextInt();
	
		if  (a1/a2 != b1/b2)
		{
		    System.out.println("line is intersecting");
		}
	
		else if (a1/a2 == b1/b2 && b1/b2 == c1/c2 )
		{
			System.out.println("line is coincide");
		}
		
		else if (a1/a2 == b1/b2 && b1/b2 != c1/c2 )
		{
			System.out.println("line is parallel");
		}
		else 
			System.out.println("nothing");
		input.close();
		}
	
}

