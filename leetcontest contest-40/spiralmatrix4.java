class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];
        for (int[] i : res) {
            Arrays.fill(i, -1);
        }

        int top = 0;
        int right = res[0].length - 1;
        int bottom = res.length - 1;
        int left = 0;
        ListNode curr = head;

        while (curr != null) {
            // top= left to right
            for (int i = left; i <= right && curr != null; i++) {
                res[top][i] = curr.val;
                curr = curr.next;
            }
            top++;
            // right= top to bottom
            for (int i = top; i <= bottom && curr != null; i++) {
                res[i][right] = curr.val;
                curr = curr.next;
            }
            right--;
            // bottom= right to left
            for (int i = right; i >= left && curr != null; i--) {
                res[bottom][i] = curr.val;
                curr = curr.next;
            }
            bottom--;
            // left=bottom to top
            for (int i = bottom; i >= top && curr != null; i--) {
                res[i][left] = curr.val;
                curr = curr.next;
            }
            left++;
        }

        return res;
    }
}
