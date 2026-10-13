class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int maxValue = 0;

        //[1,7,2,5,4,7,3,6]
        
            
            while (left < right){
                int width = right - left;

                int height = Math.min(heights[left], heights[right]);
                
                int currentArea = width * height;
                
                if(currentArea > maxValue) {
                    maxValue = currentArea;
                }

                if(heights[left] <  heights[right]){
                    left++;
                }else{
                    right--;
                }
            
            }
        
        
        return maxValue;
    }
}
