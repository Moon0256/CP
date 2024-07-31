import java.util.Scanner;

public class bincolor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        while (testcases-- > 0) {
            long x = input.nextLong();
            solve(x);
        }
    }

    public static void solve(long x) {
        int[] res = new int[31];
        for (int i = 0; i < 30; i++) {
            if ((x >> i & 1) == 1) {
                if (res[i] == 1) {
                    res[i + 1] = 1;
                    res[i] = 0;
                } else if (i > 0) {
                    if (res[i - 1] == 1) {
                        res[i + 1] = 1;
                        res[i - 1] = -1;
                    } else {
                        res[i] = 1;
                    }
                } else if (i == 0) {
                    res[i] = 1;
                }
            }
        }
        System.out.println(31);
        for (int i = 30; i>= 0; i--) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
