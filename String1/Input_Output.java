

public class Input_Output {

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name:");
        // String name = sc.nextLine();
        // System.out.println("Hello, " + name);


        // String name = "Avinash Kumar";
        // System.out.println(name.length());

        String firstname = "Avinash";
        String lastname = "Kumar";
        String fullname = firstname +" "+lastname;
        printLetters(fullname);
    }
}
