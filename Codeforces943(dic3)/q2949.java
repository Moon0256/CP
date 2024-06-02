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
            if ((left & (1L << i)) != 0 || (right & (1L << i)) != 0 || (left >> (i + 1)) != (right >> (i + 1))) {
                ans |= (1L << i);
            }
        }
        return ans;
        // << is the bitwise shift operator
    }
}
