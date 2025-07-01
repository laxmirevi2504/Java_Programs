package fundamentals;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		long n=sc.nextInt();
		while(i<=n)
		{
			System.out.println(i);
			i=i+1;
		}
				
	}

}
