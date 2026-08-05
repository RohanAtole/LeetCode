class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int postfix = 1;

        int []ans = new int[nums.length];
        Arrays.fill(ans, 1);

        for(int i = 0; i < nums.length; i++){
            ans[i] = prefix;
            prefix = nums[i]*prefix;
        }

        for (int i = nums.length - 1; i >= 0; i--){
            ans[i] = ans[i]*postfix;
            postfix = postfix*nums[i];
        }
        return ans;
    }
}