package CodeforcesRound952Div4;
import java.util.Scanner;

public class maxMultipleSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int g = 0; g<testcases;g++){
            int n = input.nextInt();
            int opx = 2;
            int maxSum = 0;

            for (int x = 2; x <= n; x++) {
                int k = n/x;
                int sum = x*k*(k+1)/2;

                if (sum > maxSum) {
                    maxSum = sum;
                    opx = x;
                }
            }

            System.out.println(opx);
        }
    }
    
}
