package fundamentals;

import java.util.Scanner;

public class UserInput {
	public static void main(String args[])
	{

	Scanner sc=new Scanner(System.in);
	float a;
	double d;
	long l;
	short s;
	String str=sc.next();
	char ch=str.charAt(0);
	// if you want to print entire line you can use nextLine()
	
	
	a=sc.nextFloat();
	
	d=sc.nextDouble();
	
	l=sc.nextLong();
	
	s=sc.nextShort();
	System.out.print(a);
	System.out.println(d);
	System.out.println(l);
	System.out.println(s);
	System.out.print(ch);
	
	}
}
