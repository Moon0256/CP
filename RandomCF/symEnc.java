package RandomCF;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
public class symEnc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i =0; i< testcases; i++){
            int len = input.nextInt();
            input.nextLine();
            String b = input.nextLine();
            System.out.println(decodeSt(len, b));
        }
    }
    public static String decodeSt(int len, String b){
        TreeSet<Character> disChar = new TreeSet<>();
        for(char c: b.toCharArray()){
            disChar.add(c);
        }
        List<Character> listi = new ArrayList<>(disChar);
        char[] stri = new char[len];
        for (int j = 0; j < b.length(); j++) {
            int index = listi.indexOf(b.charAt(j));
            stri[j] = listi.get(listi.size() - 1 - index);
        }
        return new String(stri);

    }
}
