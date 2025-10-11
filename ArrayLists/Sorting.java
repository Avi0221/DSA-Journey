
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        list.add(2);
        list.add(9);
        list.add(3);
        list.add(1);
        list.add(10);

        System.out.println("Original List:"+list);

        Collections.sort(list);
        System.out.println("Ascending Order:"+list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Decending Order:"+list);

    }
}
