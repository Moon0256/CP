package Codeforces951Div2;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for (int i = 0; i < testcases; i++) {
            int n = input.nextInt();
            int[] ks = new int[n];
            for (int j = 0; j < n; j++) {
                ks[j] = input.nextInt();
            }
            bet(n, ks);
        }
        input.close();
    }

    public static void bet(int n, int[] ks) {
        long lcm = lcmOfArray(ks);
        long[] factors = new long[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            factors[i] = lcm / ks[i];
            sum += factors[i];
        }

        if (sum < lcm) {
            for (long factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();
        } else {
            System.out.println(-1);
        }
    }

    // Helper method to find GCD of two numbers
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to find LCM of an array of numbers
    static long lcmOfArray(int[] arr) {
        long lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = lcm(lcm, arr[i]);
        }
        return lcm;
    }

    // Helper method to find LCM of two numbers
    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}
