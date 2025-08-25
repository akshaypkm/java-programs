package Search_Probs

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int l = 0;
        int r = nums.length-1;

        ans[0] = first(nums,  target);
        ans[1] = second(nums,  target);

        return ans;
    }

    static int first(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int first = -1;
        while(l<=r){
            int mid = (l+r)/2;

            if(nums[mid] == target){
                first = mid;
                r = mid-1;
            }else if(nums[mid]<target){
                l = mid+1;
            }else{
                r = mid -1;
            }
            
        }
        return first;
    }

    static int second(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int second = -1;
        while(l<=r){
            int mid = (l+r)/2;

            if(nums[mid] == target){
                second = mid;
                l = mid+1;
            }else if(nums[mid]<target){
                l = mid+1;
            }else{
                r = mid -1;
            }
            
        }
        return second;
    }
}