class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];

        for(int j = 0 ; j<=n; j++){
            int count = 0;
            String s = binary(j);
            for(int i = 0; i < s.length(); i++){
                if('1' == s.charAt(i)){
                    count++;
                }
            }
            arr[j] = count;
            count = 0;
        }
        return arr;
    }

    public static String binary(int n){
        StringBuilder st = new StringBuilder();
        while(n > 0){
            st.append(n % 2);
            n = n / 2;
        }
        st.reverse();
        return st.toString();
    }
}
