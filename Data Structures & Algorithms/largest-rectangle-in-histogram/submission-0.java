class Solution {
    public int largestRectangleArea(int[] heights) {
         if (heights == null || heights.length == 0) {
            return 0;
        }

        int maxArea = 0;
        int n = heights.length;
        
        // Deque is preferred over the legacy Stack class in Java
        // The stack stores indices of the bars in strictly increasing order of their heights
        Deque<Integer> stack = new ArrayDeque<>();

        // We iterate up to i <= n to handle a "dummy" bar of height 0 at the end.
        // This forces everything left in the stack to be popped and evaluated.
        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            // When the current bar is shorter than the bar at the top of the stack,
            // we've found the right boundary for the stack's top bar!
            while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
                int height = heights[stack.peek()];
                stack.pop();

                // The width spans from the current index 'i' (right boundary) 
                // to the new top of the stack (left boundary).
                // If the stack is empty, it means this bar extended all the way to index 0.
                int width = stack.isEmpty() ? i : (i - stack.peek() - 1);

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
