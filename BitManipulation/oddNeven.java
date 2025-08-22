public class oddNeven {

    public static void oddNeven(int n){
        int bitmask = 1;
        if((n & bitmask)==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        oddNeven(3);
        oddNeven(10);
        oddNeven(9);
    }
}
