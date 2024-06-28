package CodeforcesRound955Div2;
import java.util.Scanner;

public class Soccer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int g = 0; g<t;g++){
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            input.nextLine();
            int x2 = input.nextInt();
            int y2 = input.nextInt();

            if(x1>y1){
                if(x2>y2){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                if(x2<y2){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
            


        }
    }
    
}
