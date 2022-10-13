class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> difficulty=new HashMap<>();
        
        for(int task:tasks){
            difficulty.put(task,difficulty.getOrDefault(task,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry:difficulty.entrySet()){
            int freq=entry.getValue();
            if(freq==1){
                return -1;
            }
            
            if(freq%3!=0){
                ans+=freq/3+1;
            
            }else{
                ans+=freq/3;
            }
        }
        return ans;
    }
}
