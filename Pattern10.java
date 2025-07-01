package fundamentals;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1;
        int p=1;
        while(i<=n) {//for row
        int j=1;
        while(j<=i)
        {
        	System.out.print(p);
        	p=p+1;//for column
        	j=j+1;
        }
        System.out.println();
        i=i+1;
        }
	}

}

//output
//4
//1
//23
//456
//78910


