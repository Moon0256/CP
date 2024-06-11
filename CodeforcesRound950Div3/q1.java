package CodeforcesRound950Div3;
import java.lang.Math;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i<testcases;i++){
            int n = input.nextInt();
            int m = input.nextInt();
            String chari = input.next();
            char[] chary = chari.toCharArray();
            int[] count = new int[7];
            for(int j=0;j<n;j++){
                int index = chary[j]-'A';
                count[index]++;
            }
            int sum = 0;
            for(int k=0;k<7;k++){
                sum+=Math.max(m-count[k],0);
            }
            System.out.println(sum);
        }
        
        
    }


}
