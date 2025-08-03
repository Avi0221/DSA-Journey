public class Binary_Search {
    public static int BinarySearch(int Numbers[],int key){
        int start=0;
        int end=Numbers.length-1;

        while(start<=end){
            int mid =(start+end)/2;
            if(Numbers[mid]==key){
                return mid;
            }
            if(Numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;



    }

    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int key =10;
        int result = BinarySearch(number, key);

        if(result==-1){
            System.out.println("Element is not present in array");
        }else{
            System.out.println("Element is present at index "+result);
        }
    }
}
