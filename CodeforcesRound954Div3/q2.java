package CodeforcesRound954Div3;
import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int g = 0; g<t; g++){
            int n = input.nextInt();
            int m = input.nextInt();
            int[][] a = new int[n][m];
            for(int v = 0; v<n; v++){
                for(int w = 0; w<m;w++){
                    a[v][w] = input.nextInt();
                }
            }
            boolean changed;

        do {
            changed = false;
            int[][] newMatrix = new int[n][m];
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < m; z++) {
                    newMatrix[y][z] = a[y][z];
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int current = a[i][j];
                    int maxNeighbor = 0;
                    if (i > 0) maxNeighbor = Math.max(maxNeighbor, a[i-1][j]);  
                    if (i < n - 1) maxNeighbor = Math.max(maxNeighbor, a[i+1][j]);  
                    if (j > 0) maxNeighbor = Math.max(maxNeighbor, a[i][j-1]);         
                    if (j < m - 1) maxNeighbor = Math.max(maxNeighbor, a[i][j+1]);  

                    if (current > maxNeighbor) {
                        newMatrix[i][j] = maxNeighbor;
                        changed = true;
                    }
                }
            }
            for (int d = 0; d < n; d++) {
                for (int e = 0; e < m; e++) {
                    a[d][e] = newMatrix[d][e];
                }
            }
        } while (changed);

        for(int k = 0; k<n;k++){
            for(int l = 0; l<m;l++){
                System.out.print(a[k][l]+" ");
            }
            System.out.println();
        }
        
        
    }
    
}
}