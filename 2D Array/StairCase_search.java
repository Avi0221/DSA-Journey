public class StairCase_search {


    public static boolean StairCase_search(int matrix[][],int key){
        int row = 0;
        int col = matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.print("Found Key At ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }


        }
        System.out.print("Key Not Found!!");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 32;

        StairCase_search(matrix, key);
    }
}
