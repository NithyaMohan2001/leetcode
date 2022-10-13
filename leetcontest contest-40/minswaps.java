class Solution {
   
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int totalones=0;
        int circular[]=new int[2*n];
        
        for(int i=0;i<n;i++){
            totalones+=nums[i];
            circular[i]=nums[i];
            circular[n+i]=nums[i];
        }
        
        int start=0;
        int end=0;
        int zerocount=0;
        int minzero=Integer.MAX_VALUE;
        for(;end<totalones;end++){
            if(circular[end]==0){
                zerocount++;
            }
        }
        
        for(;end<circular.length;end++){
            if(circular[end]==0){
                zerocount++;
            }
            
            if(end-start+1==totalones){
                zerocount=Math.min(minzero,zerocount);
            }else if(end-start+1>totalones){
                if(circular[start]==0){
                    zerocount--;
                }
                minzero=Math.min(minzero,zerocount);
                start++;
            }
        }
        return minzero;
    }
}
