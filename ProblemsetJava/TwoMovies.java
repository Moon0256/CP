package ProblemsetJava;
import java.util.Scanner;

public class TwoMovies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int g = 0; g<t; g++){
            int n = input.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0; i<n; i++){
                a[i] = input.nextInt();
            }
            for(int j = 0; j<n; j++){
                b[j] = input.nextInt();
            }
            int mov1 = 0;
            int mov2 = 0;
            // Not yet the correct version
            
            for(int k = 0; k<n; k++){
                if(a[k]!=b[k]){
                    int max = a[k];
                    if(b[k]>a[k]){
                        max = b[k];
                        mov2+=max;
                    }else{
                        mov1+=max;
                    }                     
                }else{
                    if(a[k]==1){
                        int min = mov1;
                        if(mov2<min){
                            min = mov2;
                        }
                        min+=1;
                    }else if(a[k]==-1){
                        int max = mov1;
                        if(mov2>max){
                            max = mov2;
                        }
                        max-=1;
                    }
                }
            }
            int minR = mov1;
            if(mov2<minR){
                    minR = mov2;
            }

        System.out.println(minR);
        }
    }
    
}
