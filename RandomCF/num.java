package RandomCF;

import java.util.Scanner;
class num
{
	public static void main (String[] args){
	    Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int half = num/2;
        if(num%2==0){
            System.out.println(half);
            for(int i = 0; i<half;i++){
                System.out.print(2+" ");
            }
            
        }else{
            System.out.println(half);
            for(int i = 0; i<half-1;i++){
                System.out.print(2+" ");
            }
            System.out.print(3);
        }

	}
}
