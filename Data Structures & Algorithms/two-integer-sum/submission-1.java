class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> sol = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int complement = target-nums[i];
            if(sol.containsKey(complement)){
                ans[0]=sol.get(complement);
                ans[1] = i;
                return ans;
            }
            sol.put(nums[i],i);
            
        }
        return ans;
    }
}
