import java.util.Arrays;

public class QuickSort {
    public static void main(String args[]){
        int arr[] = {1, -10, 5, 18, 23, -1, 9, 4, -6, 2};
        System.out.println("Original array is: " + Arrays.toString(arr));
        
        long startTime = System.nanoTime();
        quicksort(arr, 0, arr.length-1);
        long endTime = System.nanoTime();
        
        System.out.println("Sorted array is: " + Arrays.toString(arr));
        System.out.println("Program running time: " + (endTime-startTime) + "ns");
    }
    
    public static int divide(int[] arr, int start, int end){
        // 每次都以最右侧元素作为基准
        int base = arr[end];
        while(start < end){
            while(start < end && arr[start] <= base)
                // 从左侧开始遍历，如果比基准值小，就继续向右
                start++;
            // 以上while循环结束时，就说明当前的a[start]的值比基准值大，应与基准值进行交换
            if(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                // 交换后，此时的那个被调换的值也同时调到了正确的位置（基准值右侧），因此右边也要同时向前移动一位
                end--;
            }
            while(start < end && arr[end] >= base)
                end--;
            if(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
            }
        }
      //这里返回start或者end皆可，此时的start和end都为基准值所在的位置
        return end;
    }
    
    public static void quicksort(int[] arr, int start, int end){
        if(start > end){
            // 如果只有一个元素就不用再排下去
            return;
        }
        else {
            int partition = divide(arr, start, end);
            quicksort(arr, start, partition-1);
            quicksort(arr, partition+1, end);
        }
    }
}
