package RandomCF;
import java.util.Scanner;
import java.lang.Math;
public class chessfor3 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
    int testcases = input.nextInt();

    for(int i = 0; i<testcases; i++){
        int p1 = input.nextInt();
        int p2 = input.nextInt();
        int p3 = input.nextInt();
        System.out.println(maxSc(p1,p2,p3)); 
        
    }
    
    }

    public static int maxSc(int p1, int p2, int p3){
        if((p1+p2+p3)%2==1){
            return -1;
        }else if(p1+p2<p3){
            return p1+p2;
        }else{
            return (p1+p2+p3)/2;
        }
    }

}
