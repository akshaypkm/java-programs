public class MaxProfit {
    public static void main(String args[]) {
        int[] arr = {5, 1, 2, 0, 4};
        maxProfit(arr);
    }
    
    // this is simpler one from tuf
    
    // static int maxProfit(int[] arr) {
    // int maxPro = 0;
    // int minPrice = Integer.MAX_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    //     minPrice = Math.min(minPrice, arr[i]);
    //     maxPro = Math.max(maxPro, arr[i] - minPrice);
    // }
    // return maxPro;
    // }
    
    private static void maxProfit(int[] arr){
        int buy = 0;

        int max = 0;
        int profit = 0;

        int start = 0;
        int end = 0;
        
        for(int i = 0; i<arr.length;i++){
            profit = arr[i] - arr[buy];

            if(profit < 0){
                buy = i;
            }

            if(max<=profit){
                max = profit;
                start = buy;
                end = i;
            }
            System.out.println("Profit: "+profit);
        }
        if(max <=0)return;
        System.out.println("Max profit is: "+ max);
        System.out.println("Buy on : "+ arr[start]);
        System.out.println("Sell on : "+ arr[end]);

    }

    
}
