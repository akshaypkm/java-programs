package Array_Problems;

public class MaxConsecutiveOnes {
    public static void main(String args[]) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }

    private static int findMaxConsecutiveOnes(int[] nums){
        int max = 0;
        int currCount = 0;
        for(int i= 0;i<nums.length;i++){
            if(nums[i] == 1 ){
                currCount++;
                if(currCount>max){
                    max = currCount;
                }
            }else{
                currCount = 0;
            }
        }
        return max;
    }
}
