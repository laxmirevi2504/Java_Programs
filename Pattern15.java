package fundamentals;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int i=1;
//        int p=1;
//        while(i<=n) {//for row
//        int j=1;
//        while(j<=n)
//        {
//        	char jthchar=(char)('A'+i-1);
//        	System.out.print(p);//for column
//        	j=j+1;
//        }
//        System.out.println();
//        i=i+1;
//        }
        
        
       int i=1;
      while(i<=n) {//for row

      char p=(char)('A'+i-1);
      int j=1;
      while(j<=n)
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
//4
//AAAA
//BBBB
//CCCC
//DDDD

