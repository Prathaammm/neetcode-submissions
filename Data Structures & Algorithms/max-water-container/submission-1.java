class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        for(int i = 0; i<heights.length; i++){
            for(int j = i+1; j<heights.length;j++){
               int l = Math.min(heights[i],heights[j]);
               int x = l * (j - i);

               if(x > area){
                area = x;
               }
            }
        }
        return area;
    }
}
