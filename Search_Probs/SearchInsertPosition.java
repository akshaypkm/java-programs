package Search_Probs;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int pos = 0;
        while(left <= right){
            int mid = (left+right) / 2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                pos = mid;
                right = mid -1;
            }else{
                pos = mid+1;
                left = mid+1;
            }
        }
        return pos;
    }
}