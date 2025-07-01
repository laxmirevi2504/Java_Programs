package fundamentals;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

//        for (int i = 1; i <= N; i++) {
//            int num = i;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num);
//                num++;
//            }
//            System.out.println();
        
//        }
        
        
        int i=1;
        while(i<=N) {//for row
        int j=1;
        while(j<=N)
        {
        	System.out.print("*");//for column
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
//****
//****
//****
