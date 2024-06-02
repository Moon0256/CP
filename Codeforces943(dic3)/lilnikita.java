import java.util.Arrays;
import java.util.Scanner;
public class lilnikita {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i<testcases;i++){
            int n = input.nextInt();
            int m = input.nextInt();
            if(possible(n, m)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
    public static boolean possible(int n, int m){
        if(m>n){
            return false;
        }

        for(int j=0;j<=n/2;j++){
            if(m==n-2*j){
                return true;
            }
        }
        return false;
    }

}
