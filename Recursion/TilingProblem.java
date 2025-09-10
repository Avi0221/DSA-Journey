

public class TilingProblem {


    public static int TilingProblem(int n){  //2 X n floor
        // base Case
        if(n==0 || n==1){
            return 1;
        }

        // Kaam
        // Vertical Tiles
        int f1 = TilingProblem(n-1);

        // Horizontal Tiles
        int f2 = TilingProblem(n-2);

        // TotalNumber of Ways
        int totalWays = f1 +f2;
        return totalWays;

    }
    public static void main(String[] args) {
    
        System.out.println("Total Number Of Ways:"+TilingProblem(6));
    }
}
