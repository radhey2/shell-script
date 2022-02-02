package school.d;

import java.util.Scanner;

public class LIneuc1 {

	public static void main(String[] args) {
		int x1, x2, y1, y2;
		double length;
		Scanner input = new Scanner (System.in);
		System.out.println("enter a point x1");
		x1  = input.nextInt();
		System.out.println("enter a point y1");
		y1  = input.nextInt();
		System.out.println("enter a point x2");
		x2  = input.nextInt();
		System.out.println("enter a point y2");
		y2  = input.nextInt();
		length = Math.sqrt((x2 - x1) * (x2 - x1)  + (y2 - y1) * (y2 - y1));
		System.out.println("Distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+") = "+length);
		
        input.close();
	}

}
