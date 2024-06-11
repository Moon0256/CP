import java.util.Arrays;
import java.util.Scanner;
public class chamo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i<testcases;i++){
            int len = input.nextInt();
            int[] arr= new int[len];
            for(int j = 0;j<len;j++){
                arr[j]=input.nextInt();
            }
            System.out.println(maxi(len, arr));
        }
    }
    public static int maxi(int len, int[] arr){

        if(len<3){
            int minel = arr[0];
            if(arr[1]<minel){
                minel  = arr[1];
            }
            return minel;
        }
        int[] maxers = new int[len-2];
        for(int m = 0; m<len-2; m++){
            int[] arri = {arr[m], arr[m+1], arr[m+2]};
            Arrays.sort(arri);
            maxers[m] = arri[1];

        }
        int maxel = maxers[0];
        for(int n = 0; n<len-2; n++){
            if(maxers[n]>maxel){
                maxel = maxers[n];
            }
        }
        return maxel;
    }


}
