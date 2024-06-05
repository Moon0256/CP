package Codeforces950Div3;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i<testcases;i++){
            int n = input.nextInt();
            int[] as = new int[n];
            int[] bs = new int[n];
            input.nextLine();
            for(int j = 0; j<n; j++){
                as[j]=input.nextInt();
            }
            input.nextLine();
            for(int k = 0; k<n; k++){
                bs[k]=input.nextInt();
            }
            input.nextLine();
            int m = input.nextInt();
            int[] ds = new int[m];
            for(int l = 0;l<m;l++){
                ds[l]=input.nextInt();
            }
            cExist(n, as, bs, m, ds);
            
        }
        
    }
    public static void cExist(int n, int[] as, int[] bs, int m, int[] ds){
        System.out.println(n+" "+ m+" "+as[0]+ " "+ bs[0]);


    
    }

}
