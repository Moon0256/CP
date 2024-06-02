import java.util.Scanner;
public class tshirtsize {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases  = input.nextInt();

        for(int i = 0; i < testcases; i++){
            String s1 = input.next();
            String s2 = input.next();
            // System.out.println(size1);
            // System.out.println(size2);
            char[] size1 = s1.toCharArray();
            char[] size2 = s2.toCharArray();
            double score1 = scorer(size1, size1.length); 
            double score2 = scorer(size2, size2.length);
            if(score1>score2){
                System.out.println(">");
            }else if(score1<score2){
                System.out.println("<");
            }else{
                System.out.println("=");
            }

        }
    }

    public static double scorer(char[] arr, int length){
        double score = 1;
        if(arr[length-1]=='S'){
            for(int j = 0; j<=length-1; j++){
                score*=0.5;
            }
        }else if(arr[length-1]=='L'){
            for(int j = 0; j<=length-1; j++){
                score*=2;
            }
        }else{
            score=1; 
        }
        return score;

    }

}
