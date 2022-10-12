class Solution {
    public int longestContinuousSubstring(String s) {
        int start=0;
        int i=0;
        int len=s.length();
        int maxlen=0;
        int currlen=0;
        while(i<len){
            while((i+1<len)&&((int)(s.charAt(i))+1==(int)(s.charAt(i+1)))){
                i++;
            }
                  currlen=i-start+1;
                  maxlen=Math.max(maxlen,currlen);
                  i++;
                  start=i;
        }
                  return maxlen;
    }
}
