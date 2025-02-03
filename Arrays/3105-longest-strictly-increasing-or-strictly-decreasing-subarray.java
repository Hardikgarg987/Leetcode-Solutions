class Solution {
    public int longestMonotonicSubarray(int[] a) {
        int n = a.length;
        int count = 1;
        int maxL = 1;
        for(int i = 1;i < n;i++){
            if(a[i] > a[i-1]){
                count++;
            }else{
                count = 1;
            }
            maxL = Math.max(maxL, count);
        }
        count = 1;
        for(int i = 1;i < n;i++){
            if(a[i] < a[i-1]){
                count++;
            }else{
                count = 1;
            }
            maxL = Math.max(maxL, count);
        }
        return maxL;
    }
}