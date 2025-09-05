public class Method_Overriding {
    public static void main(String[] args) {
        Deer D = new Deer();
        D.eat();
    }
}


class Animal1{
    void eat(){
        System.out.println("Eats Anything!!!!");
    }

}

class Deer extends Animal1{
    void eat(){
        System.out.println("Eats Grass!!!!");
    }
}
