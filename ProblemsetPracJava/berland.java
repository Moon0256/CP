package ProblemsetPracJava;

import java.util.Scanner;

public class berland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0; i<t;i++){
            int n = input.nextInt();
            if(n==1||n==4||n==7){
                System.out.println(1);
            }else if(n==2){
                System.out.println(2);
            }else{
                System.out.println(0);
            }
        }
    }
}
