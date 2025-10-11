
import java.util.ArrayList;


public class Syntax {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        // Add Operation

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // System.out.println(list);

        // Get Operation

        // int element = list.get(2);

        // System.out.println("Element in Index 2 is "+element);


        // Remove Operation 
        // list.remove(2);
        // System.out.println(list);

        // Set Element at Index
        // list.set(2, 10);
        // System.out.println(list);

        // Contains Elements
        // System.out.println(list.contains(2));
        // System.out.println(list.contains(11));


        // Size of ArrayList

        System.out.println("Size Of ArrayList :"+list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


    }
}
