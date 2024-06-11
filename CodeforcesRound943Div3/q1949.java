import java.util.Scanner;

public class q1949 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for (int i = 0; i < testcases; i++) {
            int l = input.nextInt();
            int r = input.nextInt();
            

            System.out.println(maxPow2(l,r));
        }

    }
    public static int maxPow2(int l, int r) {

        int num=1;
        int max=0;
        while(num*2<=r){
            num*=2;
            max++;

        }
        return max;
    }


}
