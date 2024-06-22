package ProblemsetPrac;

import java.util.Scanner;

public class InDeCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int g = 0; g<t; g++){
            int n = input.nextInt();
            int[] a = new int[n];
            int[] b = new int[n+1];
            for(int i = 0; i<n; i++){
                a[i]=input.nextInt();
            }
            for(int j = 0; j<=n;j++){
                b[j] =input.nextInt();
            }
            System.out.println(minOp(n, a, b));

        }
    }
    public static long minOp(int n, int[] a, int[] b){
        long op = 0;
        int last = b[n];
        boolean boo1 = false;
        int minDif = Math.abs(a[0]-last);

        for(int i = 0; i<n; i++){
            op+=(Math.abs(a[i]-b[i]));
            if(!boo1){
                if((a[i]>=last&&b[i]<=last)||(a[i]<=last&&b[i]>=last)){
                    boo1 = true;
                }else{
                    if(minDif>Math.abs(a[i]-last)){
                        minDif = Math.abs(a[i]-last);
                    }
                    if(minDif>Math.abs(b[i]-last)){
                        minDif = Math.abs(b[i]-last);
                    }
                }
            }
            
        }

        if(boo1){
            op+=1;
        }else{
            op+=(minDif+1);
        }

        return op;
    
    }
}

