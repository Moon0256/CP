import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class qaq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i = 0; i<testcases;i++){
            int len = input.nextInt();
            int[] arr= new int[len];
            for(int j = 0;j<len;j++){
                arr[j]=input.nextInt();
            }
            if(yuhornuh(len, arr)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    public static boolean yuhornuh(int len, int[] arr){
        Arrays.sort(arr);
        int min = arr[0];
        List<Integer> nondivi = new ArrayList<>();
        
        for(int i = 1; i<len; i++){
            if(arr[i]%min!=0){
                nondivi.add(arr[i]);
            }
        }
        if(nondivi.isEmpty()){
            return true;
        }
        for(int j = 0; j<nondivi.size();j++){
            if(nondivi.get(j)%nondivi.get(0)!=0){
                return false;
            }
        }
        
        return true;
    }

}
