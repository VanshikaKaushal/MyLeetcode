class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> seen = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        // Expand window by moving right
        for(int right = 0; right < s.length(); right++){
            // If a duplicate is found, shrink the window from the left
            while (seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }

            //Add current character to window and update max length
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
