package fundamentals;

import java.util.Scanner;

public class Relation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		boolean isEq=a==b;
		boolean isEq1=a!=b;
		boolean isEq2=a>=b;
		boolean isEq3=a<=b;
		boolean isEq4=a>b;
		boolean isEq5=a<b;
		System.out.println("is equal to : "+isEq);
		System.out.println(isEq1);
		System.out.println(isEq2);
		System.out.println(isEq3);
		System.out.println(isEq4);
		System.out.println(isEq5);
		
	}

}
