package fundamentals;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1;
        while(i<=n) {//for row
        int j=1;
        while(j<=n)
        {
        	System.out.print(n);//for column
        	j=j+1;
        }
        System.out.println();
        i=i+1;
        }
	}

}

//output
//7
//7777777
//7777777
//7777777
//7777777
//7777777
//7777777
//7777777


