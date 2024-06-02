import java.util.Scanner;

public class mmaximize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for (int i = 0; i < testcases; i++) {
            int number = input.nextInt();
            System.out.println(highdiv(number));
        }

    }

    static int highdiv(int num) {

        int maxi = 1;
        for (int j = 1; j <= num; j++) {
            if (maxi > findGCD(num, j) + j) {
                maxi = findGCD(num, j) + j;
            }
        }

        if (maxi > num) {
            return maxi;
        } else {
            return num - 1;
        }
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

}
