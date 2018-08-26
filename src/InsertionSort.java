
public class InsertionSort {
    public static void main(String args[]){
        int arr[] = {1, -10, 5, 18, 23, -1, 9, 4, -6, 2};
        
        System.out.print("Original array is:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        
        long startTime = System.nanoTime();
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
        long endTime = System.nanoTime();
        
        System.out.print("Sorted array is:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("Program running time: " + (endTime-startTime) + "ns");
    }
}
