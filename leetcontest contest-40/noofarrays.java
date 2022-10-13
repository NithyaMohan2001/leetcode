class Solution {
    public int numberOfArrays(int[] arr, int l, int u) {
        int n=arr.length;
        
        //loong min=arr[0],max=arr[0],sum=0;
        long min=arr[0],max=arr[0],sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            min=Math.min(min,sum);
            max=Math.max(max,sum);
        }
        long lo=min<0?l-min:l;
        long hi=max>0?u-max:u;
        
        if(hi<lo)return 0;
        return (int)(hi-lo)+1;
    }
}
