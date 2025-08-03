public class Pairs_in_an_array {
    public static void printPairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr +","+numbers[j] + ')');
                tp++;
            }
            System.out.println();

    
        }
        System.out.println("total Number Of Pairs:"+tp);
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printPairs(numbers);
    }
}
