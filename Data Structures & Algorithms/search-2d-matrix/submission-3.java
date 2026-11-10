class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return false;
        }


        for(int i = 0; i < matrix.length; i++){
            int firstCell = matrix[i][0];
            int lastCell = matrix[i][matrix[i].length - 1];
            
            
            
            if(firstCell >= target || target <= lastCell){
                //Left and right should be coloumns
                int left = 0;
                int right = matrix[i].length - 1;
                System.out.println(left + " He " + right);
                while(left <= right){
                    
                    int mid = left + (right - left ) / 2;
                     
                    if(matrix[i][mid] == target){
                        return true;
                    }
                    
                    
                    if(matrix[i][mid] > target){
                        right = mid - 1;
                        
                    }
                    if(matrix[i][mid] < target){
                        left = mid + 1;
                    }
                    
                }
                return false;
            }
            
            
        }
        return false;

    }
}
