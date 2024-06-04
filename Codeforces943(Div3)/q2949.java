import java.util.Scanner;
public class q2949 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for (int i = 0; i < testcases; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            System.out.println(msecan(n,m));
        }
    }
    public static int msecan(int n, int m){
        int left = Math.max(0, n - m);
        int right = n + m;
        int ans = 0;
        
        for (int i = 31; i >= 0; --i) {
            // have to check bits
            // the idea is to check the bits of max(n-m,0) and n+m, starting from the most significant bit, and 
            // for bits with the same bit just do 2 to that power multiplied by the bit, 
            // but if the bits are not same then multiply by 2 to that power for the rest of the bits.                  
                
        }
        return ans;

        // << is the bitwise shift operator
    }
}
