package RandomCF;
import java.util.Scanner;
public class tripair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i<testcases; i++){
            int len  = input.nextInt();
            input.nextLine();
            int[] arri = new int[len];
            for(int j = 0;j<len; j++){
                arri[j]=input.nextInt();
            }
            System.out.println(bpair(len, arri));

        }
    }
    public static int bpair(int len, int[] arri){
        int count = 0;
        
    }

}
