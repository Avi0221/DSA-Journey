public class swap_two_numbers_using_XOR {
    public static void main(String[] args) {
        int x = 2 , y = 5 ;

        System.out.println("Before Swapping :x = "+x +" and y = " +y);

        // Swap Two Numbers using XOR

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("After Swapping : x = "+x+" and y = " +y);
    }
}
