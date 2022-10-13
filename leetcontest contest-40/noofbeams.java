class Solution {
    public int numberOfBeams(String[] bank) {
        int psecuritydevicesfrq=0;
        int ans=0;
        for(String s:bank){
            int csecuritydevicesfreq=0;
            for(char c:s.toCharArray()){
                if(c=='1'){
                    csecuritydevicesfreq++;
                }
            }
            if(csecuritydevicesfreq>0){
                ans+=(psecuritydevicesfrq*csecuritydevicesfreq);
                psecuritydevicesfrq=csecuritydevicesfreq;
            }
        }
        return ans;
    }
}
