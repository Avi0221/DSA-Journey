public class clear_last_ith_bit {
    
    public static int clear_last_ith_bit(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;


    }

    public static void main(String[] args) {
        System.out.println(clear_last_ith_bit(15, 2));
    }
}
