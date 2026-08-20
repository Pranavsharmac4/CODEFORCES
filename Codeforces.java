import java.util.Arrays;
import java.util.Scanner;

public class Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            long[] arr = new long[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long zeroOpsRange = arr[2] - arr[0];
            long onePlusOpsRange = arr[1];
            long minRange = Math.min(zeroOpsRange, onePlusOpsRange);
            
            System.out.println(minRange);
        }
        
        sc.close();
    }
}