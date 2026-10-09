class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> results = new ArrayList<>();

        Arrays.sort(nums);
        //[-4, -1, -1, 0, 1, 2] for visual representation
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                    continue;
            }
            int right = nums.length - 1;
            
            int left = i + 1;            
            
            while(left < right){

                int cal = nums[i] + nums[left] + nums[right];
                
                

                if(cal == 0){
                    List<Integer> numbers = List.of(nums[i], nums[left],
                    nums[right]);
                    results.add(numbers);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }
                    
                    
                

               
                if(cal < 0){
                    left++;
                }
                if(cal > 0){
                    right--;
                }

            }
        
        }
        return results;
    }
}
