class Solution {
    public boolean checkIfPangram(String sentence) {
        // Created count array to take count of every character.
       int[] count = new int[26];
        
        // Fill our count array
        for(int i = 0; i<sentence.length(); i++)
            count[sentence.charAt(i) - 'a']++;
        
        // Check in count array that every element is present or not !
        for(int i : count)
            if(i < 1) return false;
        
        return true;
    }
}