import java.util.Arrays;

public class MergeSort {
    public static void main(String args[]){
        int arr[] = {1, -10, 5, 18, 23, -1, 9, 4, -6, 2};
        System.out.println("Original array is: " + Arrays.toString(arr));
        
        long startTime = System.nanoTime();
        mergeSort(arr, 0, arr.length-1);
        long endTime = System.nanoTime();
        
        System.out.println("Sorted array is: " + Arrays.toString(arr));
        System.out.println("Program running time: " + (endTime-startTime) + "ns");
    }
    public static void mergeSort(int[] arr, int low, int high){
        int mid = (low + high)/2;
        if(low < high){
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int i = low; // 左指针
        int j = mid+1;  // 右指针
        int k = 0;
        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }  
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= high){
            temp[k++] = arr[j++];
        }
        for(int s = 0; s < temp.length; s++){
            arr[s+low] = temp[s];
        }
     } 
}
