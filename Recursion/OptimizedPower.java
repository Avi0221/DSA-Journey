public class OptimizedPower {
    public static int OptimizedPower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPower = OptimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        
        // If n is Odd 
        if(n%2!=0){
            halfPowerSq = x *halfPowerSq ;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.print(OptimizedPower(x, n));
    }
}
