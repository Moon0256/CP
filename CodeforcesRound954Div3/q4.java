package CodeforcesRound954Div3;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int g = 0; g<t; g++){
            int n = input.nextInt();
            input.nextLine();
            String s = input.nextLine();
            char[] si = s.toCharArray();
            int[] str = new int[n];
            for(int k = 0; k<n;k++){
                str[k]=si[k]-'0';
            }

            System.out.println(minRes(n,str));
        }
    }
    public static long minRes(int n, int[] str){
        long minres = Integer.MAX_VALUE;
        
        for(int i = 0; i<n-1;i++){
            long sum = 0;

            long twoDigNum = 10*str[i] + str[i+1];

            for(int j = 0; j<i; j++){
                if(str[j]==0){
                    return 0;
                }else if(str[j]>1){
                    sum+=str[j];
                }
            }
            
            for(int k = i+2;k<n;k++){
                if(str[k]==0){
                    return 0;
                }else if(str[k]>1){
                    sum+=str[k];
                }
            }

            if (twoDigNum == 1 && sum > 0) {
                twoDigNum = sum;
            } else {
                twoDigNum += sum;
            }
            minres = Math.min(minres, twoDigNum);
            
            
        }
        return minres;
    }
    
}
