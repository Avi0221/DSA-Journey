import java.util.Scanner;

public class TwoScouts {

    // Function to calculate nCr (combinations)
    static long nCr(int n, int r) {
        if (r > n) return 0;
        if (r > n / 2) r = n - r; // Use property nCr = nC(n-r)
        long result = 1;
        for (int i = 1; i <= r; i++) {
            result *= (n - r + i);
            result /= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values for total scouts and scouts trained in first aid
        System.out.print("Enter total number of scouts: ");
        int totalScouts = sc.nextInt();

        System.out.print("Enter number of scouts trained in first aid: ");
        int firstAidScouts = sc.nextInt();

        System.out.print("Enter number of scouts to select: ");
        int selectCount = sc.nextInt();

        int otherScouts = totalScouts - firstAidScouts;

        // Total ways to select scouts
        long totalWays = nCr(totalScouts, selectCount);

        // Ways to select 0,1,2 scouts trained in first aid from selection
        long ways0 = nCr(otherScouts, selectCount);
        long ways1 = nCr(firstAidScouts, 1) * nCr(otherScouts, selectCount - 1);
        long ways2 = nCr(firstAidScouts, 2);

        // Probabilities
        double p0 = (double) ways0 / totalWays;
        double p1 = (double) ways1 / totalWays;
        double p2 = (double) ways2 / totalWays;

        // Mean calculation
        double mean = 0 * p0 + 1 * p1 + 2 * p2;

        // Output results
        System.out.printf("Probability of 0 scouts trained in first aid: %.4f%n", p0);
        System.out.printf("Probability of 1 scout trained in first aid: %.4f%n", p1);
        System.out.printf("Probability of 2 scouts trained in first aid: %.4f%n", p2);
        System.out.printf("Mean number of scouts trained in first aid: %.4f%n", mean);

        sc.close();
    }
}