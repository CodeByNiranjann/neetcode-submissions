class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        int len=0;

        for(int num:nums){
            set.add(num);
        }

        for(int num:set){
            if(!set.contains((num-1))){
                int current=num;
                int count=1;
            
            while(set.contains((current+1))){
                current++;
                count++;
            }
            len=Math.max(len,count);
            }
        }

        
        return len;
        
    }
}
