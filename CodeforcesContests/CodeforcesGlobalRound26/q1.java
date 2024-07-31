package CodeforcesContests.CodeforcesGlobalRound26;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int z = 0; z<testcases;z++){
            int len = input.nextInt();
            int[] arr = new int[len];
            for(int i =0;i<len;i++){
                arr[i] = input.nextInt();
            }
            if(arr[0]==arr[len-1]){
                System.out.println("NO");
            }else if(arr[0]!=arr[1]&&arr[len-2]!=arr[len-1]){
                System.out.println("YES");
                int count = 0;
                System.out.print("R");
                for(int j =0; j<len-2; j++){
                    System.out.print("B");
                    count++;
                }

                // for(int k =0; k<len-count; k++){
                //     System.out.print("B");
                //     System.out.println();
                    
                // }
                System.out.print("R");
                System.out.println();
            }else{
                System.out.println("YES");
                System.out.print("R");
                System.out.print("B");

                for(int j = 0; j<len-2;j++){
                    System.out.print("R");
                }
                System.out.println();
            }
        }
    }
    
}
