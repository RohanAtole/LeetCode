class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> ns = new HashSet<>();

      for(int i = 0; i <nums.length; i++){
        if(ns.contains(nums[i])){
            return true;
        }else{
            ns.add(nums[i]);
        }
      }
        return false;
    }
}