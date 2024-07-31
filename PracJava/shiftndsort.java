package PracJava;

import java.util.Scanner;

public class shiftndsort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int g = 0; g<t;g++){
            String s = input.nextLine();
            char[] a = s.toCharArray();
            int c0 = 0;
            int c1= 0;
            for(int i =0; i<a.length;i++){
                if(a[i]=='0'){
                    c0++;
                }else{
                    c1++;
                }
            }


        }

    }
}
