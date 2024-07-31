package CodeforcesContests.CodeforcesRound953Div2;
import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases  = input.nextInt();
        for(int g = 0; g<testcases;g++){
            int n = input.nextInt();
            int[] arr = new int [n];
            int max = 0;
            for(int i=0; i<n-1;i++){
                arr[i] = input.nextInt();
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            arr[n-1]=input.nextInt();
            System.out.println(max+arr[n-1]);
            
            


        }
    }
}