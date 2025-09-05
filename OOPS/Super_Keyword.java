

public class Super_Keyword {
    public static void main(String[] args) {
        Horse1 h = new Horse1();
        System.out.println(h.color);
    }
}

class Animal3{
    String color;
    public Animal3() {
        System.out.println("Animal Constructor called!!!");
    }

    
}

class Horse1 extends Animal3{
    
    public Horse1() {
        super.color = "brown";
        System.out.println("Horse Constructor called!!");
    }
    
}

