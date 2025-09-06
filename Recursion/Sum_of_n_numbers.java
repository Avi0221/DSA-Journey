public class Sum_of_n_numbers {


    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int s1 = calcSum(n-1);
        int sn = n + s1;
        return sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.print(calcSum(n));

    }
}
