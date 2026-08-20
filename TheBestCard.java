import java.util.Scanner;

public class TheBestCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        
        int t = scanner.nextInt();
        // Using StringBuilder to buffer output and prevent I/O bottlenecks 
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            
            // The candidate card is the maximum card in the set: n + 1
            if (isPrime(n + 1)) {
                output.append("YES\n");
            } else {
                output.append("NO\n");
            }
        }
        
        // Print all results at once for optimal performance
        System.out.print(output);
        scanner.close();
    }
    
    /**
     * Checks if a number is prime.
     */
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        
        // Quickly eliminate multiples of 2 and 3
        if (num % 2 == 0 || num % 3 == 0) return false;
        
        // Check divisibility up to the square root of the number
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}