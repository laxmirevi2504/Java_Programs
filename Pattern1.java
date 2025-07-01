package fundamentals;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        int i=1;
        while(i<=n) {//for row
        int j=1;
        while(j<=i)
        {
        	System.out.print(j);//for column
        	j=j+1;
        }
        System.out.println();
        i=i+1;
        }
	}

}
//output
// 4
//1
//12
//123
//1234
