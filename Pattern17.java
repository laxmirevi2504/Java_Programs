package fundamentals;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1;
        
        while(i<=n) { 
        	//for row
        	char p=(char)('A'+i-1);
        int j=1;
        while(j<=i)
        {
        	System.out.print(p);
        	p=(char)(p+1);//for column
        	j=j+1;
        }
        System.out.println();
        i=i+1;
        }
	}

}

//output
//5
//A
//BC
//CDE
//DEFG
//EFGHI


