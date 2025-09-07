public class Problem_9 {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int p1 = pow(x, n-1);
        int pn = x* pow(x, n-1);
        return pn;
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(pow(x, n));
    }
}
