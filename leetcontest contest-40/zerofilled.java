class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c = 0;
        long l = 0;

        for (int num : nums) {
            if (num == 0) {
                l++;
                c += l;
            } else {
                l = 0;
            }
        }
        return c;
    }
}