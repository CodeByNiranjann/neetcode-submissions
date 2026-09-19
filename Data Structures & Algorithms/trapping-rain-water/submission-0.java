class Solution {
    public int trap(int[] height) {
        int leftmax=height[0];
        Stack<Integer> rightmax= new Stack<>();

        rightmax.push(height[height.length-1]);

        for(int i=height.length-2;i>=1;i--){
            rightmax.push(Math.max(rightmax.peek(),height[i]));
        }
        int total=0;

        for(int i=1;i<height.length-1;i++){
            int min=Math.min(rightmax.peek(),leftmax);
            int temp=min-height[i];
            total+=Math.max(0,temp);

            rightmax.pop();
            leftmax=Math.max(leftmax,height[i]);
        }
        return total;
    }
}
