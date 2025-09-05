public class basics {
    public static void main(String[] args) {
        Pen p1 = new Pen();           //Created a pen object called p1
        p1.setcolor("Blue");
        System.out.println(p1.getColor());
        p1.settip(8);
        System.out.println(p1.getTip());




        // BankAccount myAccount = new BankAccount();
        // myAccount.username = "Avinash";
        // myAccount.setPassword("1234567899");

    }
}
class Pen{
    private String color;
    private int tip;



    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setcolor(String newcolor){
        color = newcolor;
    }

    void settip(int newtip){
        tip = newtip;
    }
}

// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password = pwd;
//     }

// }