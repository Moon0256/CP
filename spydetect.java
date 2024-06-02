import java.util.Scanner;
public class spydetect {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i<testcases; i++){
            int numarr = input.nextInt();
            int[] arr = new int[numarr];
            for(int j = 0; j<numarr; j++){
                arr[j] = input.nextInt();

            }
            System.out.println(indexer(numarr, arr));
        }
        
    }

    public static int indexer(int numarr, int[] arr){

        int count1 = 1;
        int count2 = 0;
        int num1 = arr[0];
        int index = 1;
        for(int k = 1; k<numarr; k++){
            if(arr[k]==num1){
                count1++;
            }
            else{
                index = k+1;
                count2++;
            }
        }
        if(count1==1){
            return 1;
        }else{
            return index;
        }



    }

}
