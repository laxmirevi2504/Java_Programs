package fundamentals;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) { // For each row
            char j = (char)('A' + i - 1); // Start char of this row
            while (j >= 'A') {
                System.out.print(j); // Print characters in reverse
                j = (char)(j - 1);
            }
            System.out.println(); // Next line
            i=i+1;
        }
	}

}

//output
//5
//A
//BA
//CBA
//DCBA
//EDCBA


