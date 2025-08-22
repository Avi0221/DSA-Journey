public class check_number_is_power_of_2_or_not {

    public static boolean numberispowerof2(int n){

        return (n & (n-1)) ==0;

    }
    public static void main(String[] args) {
        System.out.println(numberispowerof2(7));
    }
}
