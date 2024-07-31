package CodeforcesContests.CodeforcesGlobalRound26;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int z = 0; z<testcases;z++){
            long x = input.nextLong();
            
            
            long num = x;
            int noDig = 0;
            while (num != 0) {
                num /= 10;
                noDig++;
            }
            int lastDigit = (int) (x % 10);
            long lowNumber = 0;
            long highNumber = 0;

            for (int i = 0; i < noDig-1; i++) {
                lowNumber = lowNumber * 10 + 5;
                highNumber = highNumber * 10 + 9;
            }

            long minSum = 2 * lowNumber; 
            long maxSum = 2 * highNumber;
            //System.out.println(lastDigit);
            //System.out.println(minSum+" -- "+maxSum);
            if (x < minSum || x > maxSum|| lastDigit==9) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
    
    
}
