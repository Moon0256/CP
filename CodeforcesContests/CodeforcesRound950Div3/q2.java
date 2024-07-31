package CodeforcesContests.CodeforcesRound950Div3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i<testcases;i++){
            int n = input.nextInt();
            int f = input.nextInt();
            int k = input.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = input.nextInt();
            }

            solve(n, f, k, a);
        }
        
    }
    public static void solve(int n, int f, int k, int[] a) {
        int fav = a[f - 1];
        Arrays.sort(a);
        int[] newarr = new int[n];

        for (int i = n-1; i >=0; i--) {
            newarr[i] = a[n-1-i];
        }
        int favink = 0;
        int favinn = 0;

        for(int i = 0; i<n;i++){
            if(newarr[i]==fav && i<k){
                favink++;
                favinn++;

            }else if(newarr[i]==fav && i>=k){
                favinn++;
            }else if(newarr[i]<fav){
                break;
            }
        }

        if(favink==favinn){
            System.out.println("YES");
        }else if(favink<favinn && favink!=0){
            System.out.println("MAYBE");
        }else{
            System.out.println("NO");
        }
    }

}
