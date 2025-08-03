import java.util.*;
public class greater_lesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Both numbers are equal");
        }
        else{
            if(a>b){
                System.out.println(a+" is greater than "+b);
            }
            else{
                System.out.println(b+" is greater than "+a);
            }    


        }
    }
}
