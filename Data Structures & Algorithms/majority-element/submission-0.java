class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int thresh = (nums.length/2);
        for(int i=0; i<nums.length;i++){
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);

            if (countMap.get(nums[i])> thresh){
                return nums[i];
            }
        }
        return -1;
    }
}