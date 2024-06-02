package Goodbye2023;

import java.util.Scanner;
public class q3_training {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for (int i = testcases; i > 0; i--) {
            input.nextLine();
            int noofel = input.nextInt();
            input.nextLine();
            long odd = 0;
            long penalty = 0;
            long[] answer = new long[noofel];
 
            for (int j = noofel; j > 0; j--) {
                int count = noofel - j;
                long x = input.nextInt();
                if (x % 2 != 0) {
                    odd++;
                }
                long sum += x;
                if (j == noofel) {
                    answer[0] = sum;
                } else {
                    if (odd % 3 == 0) {
                        penalty = odd / 3;
 
                    } else if (odd % 3 == 1) {
                        penalty = odd / 3 + 1;
 
                    } else {
                        penalty = odd / 3;
 
                    }
                    answer[count] = sum - penalty;
                }
            }
            for (int k = 0; k < noofel; k++) {
                System.out.print(answer[k] + " ");
            }
            System.out.println();
        }
    }
}