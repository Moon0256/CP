import java.util.Scanner;
public class countpair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i =0; i< testcases; i++){
            int len = input.nextInt();
            int maxOpr = input.nextInt();
            String str = input.next();
            char[] stri = str.toCharArray();
            System.out.println(maxBurle(countArr(len, maxOpr, stri), maxOpr));
            
        }
    }
    public static int[][] countArr(int len, int maxOpr, char[] stri){
        int[][] count = new int[2][26];
        char[][] alphy = {
            {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'},
            {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}
        };
        for(int j = 0; j<len; j++){
            for(int k = 0; k<2; k++){
                for(int l = 0; l<26; l++){
                    if(stri[j]==alphy[k][l]){
                        count[k][l]++;                    
                    }
                }
            }
        }
        return count;
    }

    public static int maxBurle(int[][] count, int maxOpr){
        int burle = 0;
        for(int n = 0; n<26; n++){
            if(count[0][n]>count[1][n]){
                burle += count[1][n];
                if(maxOpr>0){
                    int needch = (count[0][n]-count[1][n])/2;
                    if(needch>maxOpr){
                        burle+=maxOpr;
                        maxOpr=0;
                    }else if(needch<maxOpr){
                        burle+=needch;
                        maxOpr-=needch;
                    }else{
                        burle+=needch;
                        maxOpr=0;
                    }
                }

            }else if(count[0][n]<count[1][n]){
                burle += count[0][n];
                if(maxOpr>0){
                    int needch = (count[1][n]-count[0][n])/2;
                    if(needch>maxOpr){
                        burle+=maxOpr;
                        maxOpr=0;
                    }else if(needch<maxOpr){
                        burle+=needch;
                        maxOpr-=needch;
                    }else{
                        burle+=needch;
                        maxOpr=0;
                    }
                }

            }else{
                burle+=count[0][n];
            }

        }
        return burle;
    }
}
