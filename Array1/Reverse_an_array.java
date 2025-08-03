public class Reverse_an_array {

    public static void reverse(int number[]){
        int first=0;
        int last =number.length-1;

        while (first<last) {
            // swapping
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;


            first++;
            last--;
            
        }
    }


    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        reverse(numbers);

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}