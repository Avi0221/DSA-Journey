public class Kadanes_algo {
    public static void kadanes(int numbers[]){
        int csum = 0;
        int msum = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            csum=csum+numbers[i];
            if(csum<0){
                csum=0;
            }
            msum = Math.max(csum, msum);



        }
        System.out.println("Maximum sum Of Array :"+msum);
    }


    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
