package CodeforcesContests.Goodbye2023;
import java.util.Scanner;
public class q1_2023{

    public static void main(String[] args) {
        //System.out.println("Moon");
        Scanner input  = new Scanner(System.in);
        int testcases = input.nextInt();
        
        for(int i = testcases; i > 0; i--){
            //System.out.println("case:"+i);
            input.nextLine();
            int totSeq = input.nextInt();
            int remSeq = input.nextInt();
            input.nextLine();
            long prod = 1;
            for(int j = totSeq; j > 0; j--){
                int inti = input.nextInt();
                prod *=  inti;
            }
            if(2023%prod==0){
                System.out.println("YES");
                System.out.print(2023/prod+" ");
                for(int k = remSeq-1; k > 0; k--){
                    System.out.print(1+" ");
                }
            }else{
                System.out.println("NO");
            }


        }
    }




}

