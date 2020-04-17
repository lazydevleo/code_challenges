class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int[] r = new int[2];
        
        
        for(int i=0;i<nums.length;i++){
            
            int comp = target-nums[i];
            
            if(map.get(comp)!=null) {
                
                r[1] = i;
                r[0] = map.get(comp);
                return r;
            }
                
                
            map.put(nums[i],i);
        }
                
        return r;
        
        
        
    }
}
