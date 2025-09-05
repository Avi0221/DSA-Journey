public class abstract_class {
    public static void main(String[] args) {
        // Horse H = new Horse();
        // H.eat();
        // H.walk();
        // System.out.println(H.color);


        // chicken C = new chicken();
        // C.eat();
        // C.walk();



        Mastang myHorse = new Mastang();
        
    }
}


abstract class Animal2{
    String color;
    Animal2(){
        System.out.println("Animal Constructor Called!!!");
    }
    void eat(){
        System.out.println("Eats Anything!!!");
    }

    abstract void walk();
}


class Horse extends Animal2{

    Horse() {
        System.out.println("Horse Constructor Called!!!");
    }

    

    void ChangeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("Walk On 4 legs!!");
    }
}


class Mastang extends Horse{

    Mastang() {
        System.out.println("Mastang Constructor Called!!!");
    }
    
}

class chicken extends Animal2{

    chicken() {
        System.out.println("Chicken Constructor Called!!!!");
    }


    
    void ChangeColor(){
        color="Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs!!");
    }
}
