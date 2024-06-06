import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i<testcases;i++){
            int x =input.nextInt();
            int y = input.nextInt();

            maxlen(x, y);
            
        }
    }
    public static void maxlen(int x, int y){
        int k = x^y;
        
        int position = 1;
        int ans=1;  
        if(k==0){
            System.out.println(0);
            return;
        }
        while ((k & 1) == 0) {
            k >>= 1; 
            position++;
            ans<<=1;
        }
        System.out.println(ans);


    }
    
    
    
}
