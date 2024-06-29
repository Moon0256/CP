package ProblemsetPracJava;
import java.util.Scanner;

public class SubstringSubsequence{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int g =0; g<t;g++){
            String a = input.next();
            String b = input.next();
            int n = a.length();
            int m = b.length();
            int ans = n + m;

            for (int i = 0; i < m; ++i) {
                int j = i;
                for (char c : a.toCharArray()) {
                    if (j < m && c == b.charAt(j)) {
                        ++j;
                    }
                }
                ans = Math.min(ans, n + m - (j - i));
            }

            System.out.println(ans);

            
        }
    }
}