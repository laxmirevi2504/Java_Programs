package fundamentals;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        // First star
	        System.out.println("*");

	        // Upper half including middle row
	        int i = 1;
	        while (i <= n) {
	            System.out.print("*");

	            int j = 1;
	            while (j <= i) {
	                System.out.print(j);
	                j=j+1;
	            }

	            j = i - 1;
	            while (j >= 1) {
	                System.out.print(j);
	                j=j-1;
	            }

	            System.out.println("*");
	            i=i+1;
	        }

	        // Lower half
	        i = n - 1;
	        while (i >= 1) {
	            System.out.print("*");

	            int j = 1;
	            while (j <= i) {
	                System.out.print(j);
	                j=j+1;
	            }

	            j = i - 1;
	            while (j >= 1) {
	                System.out.print(j);
	                j=j-1;
	            }

	            System.out.println("*");
	            i=i-1;
	        }

	        // Last star
	        System.out.println("*");

	}

}

//output
//6
//*
//*1*
//*121*
//*12321*
//*1234321*
//*123454321*
//*12345654321*
//*123454321*
//*1234321*
//*12321*
//*121*
//*1*
//*
