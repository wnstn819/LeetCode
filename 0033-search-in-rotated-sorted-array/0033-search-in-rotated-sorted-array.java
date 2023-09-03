class Solution {
    public int search(int[] nums, int target) {
        
        int start =0;
        int end = nums.length-1;

        while(start < end){
            int mid = (start + end)/ 2;
            if(nums[mid] < nums[start]){
                if(nums[mid] <= target && nums[end] >= target){
                    start = mid;
                }else{
                    end = mid-1;
                }
            }else{
                if(nums[mid] >= target && nums[start] <= target){
                    end = mid;
                    
                }else{
                    start = mid+1;
                }

            }
        }

        if(nums[start] == target){
            return start;
        }else{
            return -1;
        }
        
    }
}