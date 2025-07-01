package fundamentals;

import java.util.Scanner;

public class PrimeComposite {
        public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
        	int n=sc.nextInt();
        	
        	
        	int div=2;
        	boolean isPrime=true;
        	while(div<=n/2)
        	{
        		if(n%div==0)
        		{
        			isPrime=false;
        		}
        		div=div+1;
        	}
        	if(isPrime)
        	{
        		System.out.print("Prime");
        	}
        	else
        	{
        		System.out.print("Composite");
        	}
        }
}
