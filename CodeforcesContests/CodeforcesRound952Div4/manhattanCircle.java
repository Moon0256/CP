package CodeforcesContests.CodeforcesRound952Div4;
import java.util.Scanner;

public class manhattanCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int g = 0; g<testcases;g++){
            int n = input.nextInt();
            int m = input.nextInt();
            char[][] arr = new char[n][m];
            input.nextLine();
            //int[] counthash = new int[n];
            int minRow = n;
            int minCol = m;
            int maxRow = 0;
            int maxCol = 0;
            for(int i = 0; i < n; i++){
                String line = input.nextLine(); 
                for(int j = 0; j < m; j++){
                    arr[i][j] = line.charAt(j); 
                    if (arr[i][j] == '#') {
                        if (i < minRow) minRow = i;
                        if (i > maxRow) maxRow = i;
                        if (j < minCol) minCol = j;
                        if (j > maxCol) maxCol = j;
                    }
                }
            }
            int centerX = (minRow + maxRow)/2 + 1; 
            int centerY = (minCol + maxCol)/2 + 1; 
            System.out.println(centerX + " " + centerY);

        }
    }
    
}
