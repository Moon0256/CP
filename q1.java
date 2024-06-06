import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i<testcases;i++){
            int n = input.nextInt();
            input.nextLine();
            int[] arr =new int[n];
            for(int j = 0; j<n;j++){
                arr[j]=input.nextInt();
            }
            guarwin(n, arr);
        }
    }
    public static void guarwin(int n, int[] arr){
        int minmax = Math.max(arr[0], arr[1]);
        for(int i = 0; i<n-1; i++){
            int max = Math.max(arr[i], arr[i+1]);
            if(minmax>max){
                minmax=max;
            }
        }
        System.out.println(minmax-1);
    }
}
