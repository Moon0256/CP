import java.util.Scanner;
public class permugame {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i< testcases; i++){
            int plen = input.nextInt();
            int kturn = input.nextInt();
            int startB = input.nextInt();
            int startS = input.nextInt();
            input.nextLine();
            int[] permut=new int[plen];
            for(int j = 0; j<plen; j++){
                permut[j]=input.nextInt();
            }
            int[] arr=new int[plen];
            for(int k = 0; k<plen; k++){
                arr[k]=input.nextInt();
            }
            int scoreB = score(kturn, startB, permut, arr);
            int scoreS = score(kturn, startS, permut, arr);
            if(scoreB>scoreS){
                System.out.println("Bodya");
            }else if(scoreB<scoreS){
                System.out.println("Sasha");
            }else{
                System.out.println("Draw");
            }



        }
    }
    static int score(int kturn, int start, int[] permut, int[] arr){
        int score = 0;
        int pos = start;
        for (int i = 1; i<kturn; i++){
            
        }



    }

}
