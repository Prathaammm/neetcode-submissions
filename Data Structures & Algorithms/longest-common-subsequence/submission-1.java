class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int t1 = text1.length();
        int t2 = text2.length();

        int[][] arr = new int[t1 + 1][t2 + 1];

        for (int i = 1; i <= t1; i++) {
            for (int j = 1; j <= t2; j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                }
            }
        }

        return arr[t1][t2];
    }
}
