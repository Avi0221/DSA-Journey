public class Method_Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.Sum(1, 4));
        System.out.println(calc.Sum((float)1.5,(float)4.5));
        System.out.println(calc.Sum(1, 4, 5));
    }
}


class Calculator{

    int Sum(int a,int b){
        return a+b;
    }

    float Sum(float a, float b){
        return a+b;
    }

    int Sum(int a,int b,int c){
        return a+b+c;
    }
}