import java.util.Scanner;

public class prefiquence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for (int i = 0; i < testcases; i++) {
            int len1 = input.nextInt();
            int len2 = input.nextInt();
            input.nextLine();
            String a = input.nextLine();
            String b = input.nextLine();
            System.out.println(commo(len1, len2, a, b));


        }

    }

    static int commo(int len1, int len2, String a, String b){
        int ptra = 0;
        int ptrb = 0;
        int commol = 0;
        while(ptra<len1&&ptrb<len2){
            if(a.charAt(ptra)==b.charAt(ptrb)){
                commol = Math.max(commol,ptra+1);
                ptra+=1;  

            }
            ptrb+=1;

        }


        return commol;
    }
}
