public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();

        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        Tuna Tom = new Tuna();
        Tom.eat();
        Tom.swim();
    }
}


//Base Class 
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}

// Derived class
class Mammal extends Animal{
    void walk(){
        System.out.println("Can Walk!!!");
    }
}

class Dog extends Mammal{
    int legs;
}
class Cat extends Mammal{
    String breed;
}


// Derived class
class Bird extends Animal{
    void fly(){
        System.out.println("Can Fly!!!");
    }
}

class Peacock extends Bird{
    String Sound;
}

class Fish extends Animal{
    void swim(){
        System.out.println("Can Swim!!");
    }
}

class Tuna extends Fish{
    int number;
}

class Shark extends Fish{
    String type;
}




//Derived Class / subclass
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims in Water");
//     }
// }