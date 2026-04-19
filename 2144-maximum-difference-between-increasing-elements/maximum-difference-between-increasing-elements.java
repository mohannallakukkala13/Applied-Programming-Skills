class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        int max=nums[0];
        for(int i=1;i<(nums.length);i++){
            int val=nums[i];
           if(val>max){
            ans=Math.max(ans,(val-max));
           }
           max=Math.min(max,val);
        }
      return ans;
    }
}