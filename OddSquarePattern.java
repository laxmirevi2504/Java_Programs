package fundamentals;

import java.util.Scanner;

public class OddSquarePattern {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();

		        int[] odds = new int[n];
		        int i = 0;
		        int num = 1;

		        // Generate first N odd numbers
		        while (i < n) {
		            odds[i] = num;
		            num =num+ 2;
		            i=i+1;
		        }

		        // Print the pattern
		        i = 0;
		        while (i < n) {
		            int j = 0;
		            while (j < n) {
		                System.out.print(odds[(i + j) % n]);
		                j=j+1;
		            }
		            System.out.println();
		            i=i+1;
		        }
		    }
		


	}
//output
//4
//1357
//3571
//5713
//7135


