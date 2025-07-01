package fundamentals;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            // Print spaces
            for (int s = 1; s <= N - i; s++) {
                System.out.print("  "); // two spaces for better alignment
            }

            // Print numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }

            System.out.println();
        }
	}

}
