import java.util.*;


class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.get(nums[i]) != null && (i-map.get(nums[i])) <= k){
                return true;
            }
            else{
                map.put(nums[i],i);
            }
        }   
        return false;
    }
}