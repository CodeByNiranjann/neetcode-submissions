class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<=heights.length;i++){
            int currheight=(i==heights.length)?0:heights[i];

            while(!stack.isEmpty() && currheight<heights[stack.peek()]){
                int element=heights[stack.pop()];

                int nse=i;
                int pse=stack.isEmpty()?-1:stack.peek();
                int width=nse-pse-1;
                int area=element*width;
                maxarea=Math.max(maxarea,area);

            }
            stack.push(i);
        }
        return maxarea;
    }
}
