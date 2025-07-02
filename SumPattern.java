package fundamentals;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
	

	
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();

		        int i = 1;
		        while (i <= n) {
		            int j = 1;
		            int sum = 0;

		            // Print numbers and build sum
		            while (j <= i) {
		                System.out.print(j);
		                sum =sum+ j;
		                if (j < i) {
		                    System.out.print("+");
		                }
		                j=j+1;
		            }

		            // Print the total sum
		            System.out.println("=" + sum);
		            i=i+1;
		        }
		    }
		}
//output
//4
//1=1
//1+2=3
//1+2+3=6
//1+2+3+4=10

