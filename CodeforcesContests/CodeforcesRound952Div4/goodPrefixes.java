package CodeforcesContests.CodeforcesRound952Div4;
import java.util.Scanner;

public class goodPrefixes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int g = 0; g<testcases;g++){
            int n = input.nextInt();
            int[] arr = new int[n];
            long sum = 0;
            long max = 0;
            int count= 0;

            for(int i = 0; i<n;i++){
                arr[i] = input.nextInt();
                sum+=arr[i];
                if(arr[i]>max){
                    max = arr[i];
                }
                if(sum==2*max){
                    count++;
                }
            }
            System.out.println(count);
            

        }
    }
    
}
