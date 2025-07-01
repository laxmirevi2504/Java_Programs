package fundamentals;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1;
        while(i<=n) {//for row
        int j=1;
        while(j<=i)
        {
        	char ith=(char)('A'+i-1);
        	System.out.print(ith);//for column
        	j=j+1;
        }
        System.out.println();
        i=i+1;
        }
	}

}

//output
//4
//A
//BB
//CCC
//DDDD


