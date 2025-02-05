class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        char temp1 = ' ';
        char temp2 = ' ';
        int count = 0;
        for(int i = 0;i<n;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(count == 0){
                    temp1 = s1.charAt(i);
                    temp2 = s2.charAt(i);
                }
                if(count == 1){
                    if(s1.charAt(i) != temp2 || s2.charAt(i) != temp1 ){
                        return false;
                    }
                }
                count++;
            }
        }
            if(count == 0 || count == 2){
                return true;
            }
            return false;
    }
}