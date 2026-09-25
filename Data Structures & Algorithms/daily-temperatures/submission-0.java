class Solution {
    public int[] dailyTemperatures(int[] tempe) {
        int ans[] = new int[tempe.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tempe.length;i++){
            if(stack.size()==0 || tempe[i]<tempe[stack.peek()]){
                stack.push(i);
            }else {
                while(stack.size()>0 && tempe[i]>tempe[stack.peek()]){
                    int last = stack.pop();
                    ans[last] = i-last;
                }
                stack.push(i);
            }
        }
        return ans;
    }
}
