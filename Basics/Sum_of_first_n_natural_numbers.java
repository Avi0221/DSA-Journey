import java.util.*;
public class Sum_of_first_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers you want to add");  
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=n;i++){
            sum = sum + i;  
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum);

    }
}
