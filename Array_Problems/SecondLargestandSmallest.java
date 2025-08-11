package Array_Problems;

public class SecondLargestandSmallest {
    public static void findSecondSmallestAndLargest(int[] arr) {

        // PriorityQueue<Integer> queue = new PriorityQueue<>();
        // PriorityQueue<Integer> Maxqueue = new PriorityQueue<>(Collections.reverseOrder());
        
        // for(int i = 0;i<arr.length;i++){
        //     queue.offer(arr[i]);
        //     Maxqueue.offer(arr[i]);
        // }
        // int small = 0;
        // int large = arr.length-1;

        int small= Integer.MAX_VALUE, second_small = Integer.MAX_VALUE;
        int large= Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < small){
                second_small = small;
                small = arr[i];
            }else if(arr[i] < second_small){
                second_small = arr[i];
            }

            if(arr[i]  > large){
                second_large  = large;
                large  = arr[i];
            }else if(arr[i] > second_large){
                second_large = arr[i];
            }
        }

        System.out.println("Second small: "+second_small);
        System.out.println("Second large: "+second_large);

    }

    public static void main(String[] args) {

        // Input array size
        int[] arr = {1,62,31,43,5};
    
        // Call the method
        findSecondSmallestAndLargest(arr);
    }
}
