package PracJava;
import java.util.Scanner;

public class CatchTheCoin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int g = 0; g<n; g++){
            int x = input.nextInt();
            int y = input.nextInt();
            if(y>=-1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
