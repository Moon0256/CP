package CodeforcesContests.Goodbye2023;
import java.util.Scanner;
public class q2_twodivisors{

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // int lcm1 = lcm(5,10);
        // System.out.println(lcm1);
        int testcases = inp.nextInt();
        for(int i = testcases; i > 0; i--){
            inp.nextLine();
            int num1 = inp.nextInt();
            int num2 = inp.nextInt();
        
            if(num1%num2==0 || num2%num1==0){
                int maxi = num1;
                int mini = num2;
                if(mini>num1){
                    maxi = num2;
                    mini = num1;
                }
                System.out.println(maxi*(maxi/mini));
            }else{
                
                System.out.println(lcm(num1, num2));
            }

        }

    }
    static long lcm(int num1, int num2){
        int gcd = gcd(num1,num2);
        return((num1*num2)/gcd);
    }
    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}