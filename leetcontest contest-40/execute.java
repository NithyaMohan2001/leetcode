class Solution {
    public int[] executeInstructions(int n, int[] startpos, String s) {
        int[] ans=new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            int countmoves=0;
            int xindex=startpos[0];
            int yindex=startpos[1];
            
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='U'){
                    xindex--;
                }
                if(s.charAt(j)=='D'){
                    xindex++;
                }
                if(s.charAt(j)=='L'){
                    yindex--;
                }
                if(s.charAt(j)=='R'){
                    yindex++;
                }
                
                if(xindex<0 ||yindex<0 ||xindex>=n||yindex>=n){
                    break;
                }else{
                    countmoves++;
                }
            }
            ans[i]=countmoves;
        }
        return ans;
    }
}
