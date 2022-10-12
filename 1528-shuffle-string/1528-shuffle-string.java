class Solution {
    //brute force
    public String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();
        
        for(int i = 0 ; i<s.length(); i++){
            ch[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ch);
        
    }
}