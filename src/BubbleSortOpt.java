//鸡尾酒排序的算法描述如下：
//先对数组从左到右进行升序的冒泡排序；
//再对数组进行从右到左的降序的冒泡排序；
//以此类推，持续的、依次的改变冒泡的方向，并不断缩小没有排序的数组范围

public class BubbleSortOpt {
    public static void main(String args[]){
        int arr[] = {9, -10, 5, 18, 23, -1, 9, 4, -6, 2};
        int temp, left = 0, right = arr.length-1;
        
        System.out.print("Original array is:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        
        long startTime=System.nanoTime();   //获取开始时间  
        while(left < right){
            for(int i = left; i < right; i++){
                if(arr[i] > arr[i+1]){
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
            right--;
            for(int i = right; i > left; i--){
                if(arr[i] < arr[i-1]){
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
            left++;    
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

