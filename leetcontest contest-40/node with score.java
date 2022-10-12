class Solution {
    public int edgeScore(int[] edges) {

        // crreate an array
        long[] countsum = new long[edges.length];

        for (int i = 0; i < edges.length; i++) {
            countsum[edges[i]] = countsum[edges[i]] + i;
        }

        long max = 0;
        int ans = 0;
        for (int i = 0; i < countsum.length; i++) {
            if (countsum[i] > max) {
                max = countsum[i];
                ans = i;
            }
        }
        return ans;
    }
}