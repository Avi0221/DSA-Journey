public class Merge_Sort {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si,int ei){
        // Base Case
        if(si>=ei){
            return;
        }


        // Kaam
        int mid = si+(ei-si)/2;
        // Left Part
        mergeSort(arr, si,mid);

        // Right Part
        mergeSort(arr, mid+1, ei);

        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
            
        }
        // Left Part
        while (i<=mid) {
            temp[k++]=arr[i++];
            
        }

        // Right Part
        while (j<=ei) {
            temp[k++]=arr[j++];
        
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
