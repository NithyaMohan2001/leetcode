class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=suffix[n-1]=1;
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                prefix[i]=prefix[i-1]+1;
            }else{
                prefix[i]=1;
            }
        }
        
        for(int i=n-2;i>=0;i--){
            if(nums[i]<=nums[i+1]){
                suffix[i]=suffix[i+1]+1;
            }else{
                suffix[i]=1;
            }
        }
        
        for(int i=k;i+k<n;i++){
            if(prefix[i-1]>=k && suffix[i+1]>=k){
                ans.add(i);
            }
        }
        return ans;
    }
}
