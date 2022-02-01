package school.d;


public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num1=0, num2=1, num3, count=10, i;
		 for(i=2; i<count; i++)
		 {     
			num3 = num1 + num2  ;
			System.out.println("serirs = " + num3);
	num1=num2;
	num2=num3;
		}
	}
}

