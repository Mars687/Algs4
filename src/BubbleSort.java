
public class BubbleSort {
    public static void main(String args[]){
        int arr[] = {9, -10, 5, 18, 23, -1, 9, 4, -6, 2};
        
        System.out.print("Original array is:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        
        long startTime=System.nanoTime();   //获取开始时间  
        for(int i = 0; i < arr.length-1; i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            // 如果该数组已排序好，跳出循环体
            if(!swapped){
                break;
            }     
        }
        long endTime=System.nanoTime(); //获取结束时间  
        
        System.out.print("Sorted array is:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns"); 
    }
}
