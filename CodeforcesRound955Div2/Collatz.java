package CodeforcesRound955Div2;
import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int g = 0; g<t;g++){
            //input.nextLine();
            long x = input.nextInt();
            long y = input.nextInt();
            long k = input.nextInt();

            for(long i = 0; i<k;i++){
                x+=1;
                while(x%y==0){
                    x/=y;
                }
            }

            System.out.println(x);

        }
    }
}
