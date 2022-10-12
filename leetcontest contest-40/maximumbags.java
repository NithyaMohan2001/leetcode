class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count = 0;
        for (int i = 0; i < capacity.length; i++)
            capacity[i] = capacity[i] - rocks[i]; // subtracting current capacity from max capacity
        Arrays.sort(capacity); // sorting the array
        for (int j : capacity) {
            if (j > 0) {
                if (j <= additionalRocks) // applying greedy algo in this case
                {
                    additionalRocks -= j;
                    count++;
                } else
                    break; // we break the loop if the capacity, ie, j > additionalRocks ; no need to check
                           // next rocks
            } else
                count++; // counting those rocks whose current capacity was already at max level, so j=0
                         // in this case
        }
        return count;
    }
}