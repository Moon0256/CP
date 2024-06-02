package RandomCF;
import java.util.Scanner;
public class phonedesk {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int testcases = inp.nextInt();
        for(int i = 0; i<testcases; i++){
            int x = inp.nextInt();
            int y = inp.nextInt();
            System.out.println(screen(x,y));
        }
    }
    public static int screen(int x, int y){


        int screensFor2x2 = (y + 1) / 2; // Each screen can hold up to 2 2x2 icons
        int remainingCells = (screensFor2x2 * 15) - (y * 4);

        int remaining1x1Icons = x - remainingCells;
        if (remaining1x1Icons <= 0) {
            return screensFor2x2;
        } else {
            int screensFor1x1 = (remaining1x1Icons + 14) / 15; // Each screen can hold 15 1x1 icons
            return screensFor2x2 + screensFor1x1;
        }
        


    }

}
