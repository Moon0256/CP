package CodeforcesRound953Div2;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for (int g = 0; g < testcases; g++) {
            long n = input.nextInt();
            long k = input.nextLong();
            permute(n, k);

        }
    }

    public static void permute(long n, long k) {
        long maxManh;
        if (n%2==0) {
            maxManh = (n/2)*n;
        } else {
            maxManh = (n/2)*(n+1);
        }
        if(k%2!=0||k>maxManh){
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
        int[] permutation = new int[(int) n];
        for (int i = 0; i < n; i++) {
            permutation[i] = i + 1;
        }
        if (k / 2 < n - 1) {
            swap(permutation, 0, (int) (k / 2) );
        } else {
            // for (int i = 0; i < n; i++) {
            //     permutation[i] = (int)n - i;
            // }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(permutation[i] + " ");
        }
        System.out.println();

    }
    public static void swap(int[] permutation, int i, int j) {
        int temp = permutation[i];
        permutation[i] = permutation[j];
        permutation[j] = temp;
    }

    
}
