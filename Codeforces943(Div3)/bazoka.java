import java.util.Arrays;
import java.util.Scanner;
public class bazoka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i<testcases; i++){
            int len = input.nextInt();
            int[] arr= new int[len];
            for(int j = 0;j<len;j++){
                arr[j]=input.nextInt();
            }
            if (yeahornah(len, arr)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
    public static boolean yeahornah(int len, int[] arr){
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        for (int m = 0; m < len; m++) {
            if (Arrays.equals(arr, sorted)) {
                return true;
            }
            arr = rotatby1(len, arr);
        }
        return false; 

    }

    public static int[] rotatby1(int len, int[] arr){
        int[] newarr =new int[len];
        int temp = arr[0];


        for (int n = 0; n < len - 1; n++) {
            newarr[n] = arr[n + 1];
        }
        newarr[len - 1] = temp;
        return newarr;

    }

}
