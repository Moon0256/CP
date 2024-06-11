package CodeforcesRound952Div4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class secretBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int g = 0; g<testcases;g++){
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            long k = input.nextLong();
            long maxLocations = 0;

            List<Long> divisors = new ArrayList<>();
            for (long i = 1; i * i <= k; i++) {
                if (k % i == 0) {
                    divisors.add(i);
                    if (i != k / i) {
                        divisors.add(k / i);
                    }
                }
            }

            for (long l : divisors) {
                for (long w : divisors) {
                    if (k % (l * w) == 0) {
                        long h = k / (l * w);
                        if (l <= x && w <= y && h <= z) {
                            long positions = (x - l + 1) * (y - w + 1) * (z - h + 1);
                            maxLocations = Math.max(maxLocations, positions);
                        }
                    }
                }
            }

            
            System.out.println(maxLocations);

            
        }
    }
    
}
