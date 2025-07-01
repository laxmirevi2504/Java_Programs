package fundamentals;

import java.util.Scanner;

public class ScopeOfVar {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
//		int a=10;
//		if(a>5)
//		{
//			int b=10;
//		}
//				System.out.print(b);
		//this will through an error
		int a=sc.nextInt();
		if( a==1 )
		{
			System.out.println("One");
		}
		if( a==2 )
		{
			System.out.println("Two");
		}
		if( a==3 )
		{
			System.out.println("Three");
		}
	}

}
