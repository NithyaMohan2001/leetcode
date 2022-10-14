class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> set=new HashSet<>();
        String res="";
        for(String i:nums)set.add(Integer.parseInt(i,2));
        
        for(int i=0;i<=16;i++){
            if(!set.contains(i)){
                res=Integer.toBinaryString(i);
                break;
            }
        }
        StringBuilder temp=new StringBuilder(res);
        while(temp.length()<nums[0].length())temp.insert(0,0);
        res=temp.toString();
        
        return res;
        
    }
}
