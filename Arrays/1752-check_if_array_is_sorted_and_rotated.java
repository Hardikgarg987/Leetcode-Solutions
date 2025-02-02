class Solution {
    public boolean check(int[] a) {
        int count = 0;
        int n = a.length;
        for(int i = 0;i < n-1;i++){
            if(a[i] > a[i+1]){
                count++;
            }
        }
        if(a[n-1] > a[0]){
            count++;
        }
        if(count >= 2){
            return false;
        }
        return true;
    }
}