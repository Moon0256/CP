package CodeforcesContests.CodeforcesRound953Div2;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for (int g = 0; g < testcases; g++) {
            long n = input.nextInt();
            long a = input.nextInt();
            long b = input.nextInt();
            System.out.println(maxProf(n, a, b));

        }
    }

    public static long maxProf(long n, long a, long b) {

        long maxk = Math.min(b - a + 1, Math.min(n, b));
        long prof = 0;
        if (maxk <= 0) {
            prof = a * n;

        } else if (maxk == n) {

            prof = (maxk * (2 * b - maxk + 1)) / 2;

        } else {
            prof = (maxk * (2 * b - maxk + 1)) / 2 + ((n - maxk) * a);

        }

        return prof;
    }

}
