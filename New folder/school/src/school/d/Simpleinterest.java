package school.d;

import java.util.Scanner;

public class Simpleinterest {
         
	public static void main(String[] args) {
		 double p;
         float t;
         float r; 
         double si;
		// TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      System.out.println("enter the principal:");
          p = in.nextDouble();
      System.out.println("enter the rate:");
          r = in.nextFloat();
      System.out.println("enter the time:");
          t = in.nextFloat();
          si = (p * t * r) / 100;
          System.out.println("si = " + si);
          in.close();
           
	}

}
