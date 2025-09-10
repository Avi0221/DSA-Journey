public class Friends_Pairing_problem {
    public static int friendPairing(int n){
        // base case
        if(n==1 || n==2){
            return n;
        }

        // Kaam
        // Choice - Single
        int f1 = friendPairing(n-1);
        
        // Choice-Paired 
        int f2 = friendPairing(n-2);
        int pairWays = f1 * f2;

        // Total Number of Ways
        int totalWays = f1 + pairWays;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }
}
