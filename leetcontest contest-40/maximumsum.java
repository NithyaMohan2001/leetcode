class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = -1;

        for (int num : nums) {
            int total = getNumbertotal(num);

            if (!map.containsKey(total))
                map.put(total, num);
            else {
                ans = Math.max(ans, map.get(total) + num);
                map.put(total, Math.max(map.get(total), num));
            }
        }
        return ans;
    }

    private int getNumbertotal(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }
}public class maximumsum {
    
}
