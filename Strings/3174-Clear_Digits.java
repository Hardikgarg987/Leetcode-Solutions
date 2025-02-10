class Solution {
    public String clearDigits(String s) {
        int digit = 0;
        int n = s.length();
        StringBuilder modified = new StringBuilder(s);
        for(int i = n-1;i >= 0;i--){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                if(digit > 0){
                    modified.deleteCharAt(i+1);
                    modified.deleteCharAt(i);
                    digit--;
                }
            }else{
                digit++;
            }
        }
        return modified.toString();
    }
}