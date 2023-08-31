class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i =0;i<nums.length;i++){
            int number = target - nums[i];
            if(map.get(number) != null ){
                return new int[]{map.get(number),i};
            }
            map.put(nums[i],i);
            
        }
        return new int[]{1,2};
    }
}