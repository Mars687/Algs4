public class SelectionSort {
    public static void main(String args[]){
        int arr[] = {3, -10, 5, 18, 23, -1, 9, 4, -6, 2};
        
        System.out.print("Original array is:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        
        for(int i = 0; i < arr.length-1; i++){
            int key = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[key]){
                    key = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[key];
            arr[key] = temp;
        }
        
        System.out.print("Sorted array is:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}
