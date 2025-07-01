package fundamentals;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,avg,total;
		String str;
		str=sc.next();
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		total=a+b+c;
		avg=total/3;
		System.out.println(str);
		System.out.print(avg);
	}
}
