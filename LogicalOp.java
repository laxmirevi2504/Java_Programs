package fundamentals;

import java.util.Scanner;

public class LogicalOp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		boolean d=(a>=b)&&(a>=c);
	    System.out.println(d);
	    System.out.println((a>=b)||(a>=c));
	   
	    System.out.println(!(a>=b));
				
	}

}
