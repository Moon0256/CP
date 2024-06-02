package RandomCF;
import java.util.Scanner;
public class trafficlight {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i<testcases; i++){
            int len = input.nextInt();
            String curt = input.next();
            char curr = curt.charAt(0);
            String word = input.next();
            String biggi = word+word;
            char[] full = biggi.toCharArray();
            System.out.println(maxSec(len, curr, full));

        }

    }

    public static int maxSec(int len, char curr, char[] full){
        int[] count = new int[len];
        int[] pos = new int[len];
        for(int j = 0; j<len; j++){




        }
        

    }

}
