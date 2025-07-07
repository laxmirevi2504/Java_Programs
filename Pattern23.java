package fundamentals;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i=1;
        while(i<=n) {
        	int j=1;
        	
        	while(j<=n-i+1) {
        		System.out.print(n-i+1);
        		j=j+1;
        	}
        	System.out.println();
            i=i+1;
        }
        
	}

}

//output
//4
//****
//***
//**
//*

//4
//4444
//333
//22
//1