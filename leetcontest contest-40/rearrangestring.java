class Solution {

    public int secondsToRemoveOccurrences(String s) {
        int ans = 0;
        while (s.contains("01")) {
            s = s.replaceAll("01", "10");
            ans++;
        }
        return ans;
    }
}