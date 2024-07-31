package CodeforcesContests.CodeforcesRound952Div4;
import java.util.Scanner;

public class creatingWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int g = 0; g<testcases;g++){
            String a = input.next();
            String b = input.next();
            char[] ara = a.toCharArray();
            char[] bra = b.toCharArray();
            char first = ara[0];
            char sec = bra[0];
            
            String newa = sec+""+ara[1]+""+ara[2];
            String newb = first+""+bra[1]+""+bra[2];

            System.out.println(newa+" "+ newb);


        }
    }
}
