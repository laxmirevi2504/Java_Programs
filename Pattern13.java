package fundamentals;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1;
        while(i<=n) {//for row
        int j=1;
        while(j<=i)
        {
        	System.out.print(i);//for column
        	j=j+1;
        }
        System.out.println();
        i=i+1;
        }
	}

}

//output
//5
//1
//22
//333
//4444
//55555


