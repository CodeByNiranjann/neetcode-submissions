class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int rigth=nums.length-1;

        while(left<rigth){
            int sum=nums[left]+nums[rigth];

            if(sum==target){
                return new int[]{left+1,rigth+1};
            }

            if(sum<target){
                left++;
            }else{
                rigth--;
            }
        }
        return new int[]{};
    }
}
