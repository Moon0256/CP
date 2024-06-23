package CodeforcesRound954Div3;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int g = 0; g<t; g++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int mid = 0;
            if ((a >= b && a <= c) || (a <= b && a >= c)) {
                mid =a;
            } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
                mid = b;
            } else {
                mid = c;
            }
            int dis1 = Math.abs(mid-a)+Math.abs(mid-b)+Math.abs(mid-c);
            System.out.println(dis1);



        }
    }
}
