package fundamentals;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();

		        int i = 0;
		        while (i <= n) {
		            // Print leading spaces
		            int space = 0;
		            while (space < i) {
		                System.out.print(" ");
		                space=space+1;
		            }

		            // Print stars
		            int star = 0;
		            while (star < n) {
		                System.out.print("*");
		                star=star+1;
		            }

		            // Move to next line
		            System.out.println();
		            i=i+1;
		        }
		    }
		

	}
//output
//4
//****
// ****
//  ****
//   ****
//    ****

