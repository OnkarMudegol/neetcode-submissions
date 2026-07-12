class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int writer =0;
        for(int reader=0; reader<nums.length; reader++){
            if(nums[reader] != val){
                nums[writer] = nums[reader];
                writer++;
            }
            else{
                count++;
            }
        }

        return nums.length-count;
    }
}