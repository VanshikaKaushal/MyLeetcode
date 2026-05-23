class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()> s2.length()){
            return false;
        }

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Frequency count for s1
        for (char c : s1.toCharArray()){
            s1Count[c - 'a']++;
        }

        int left = 0;
        for(int right = 0; right < s2.length(); right++){

            // Add current character to the window
            windowCount[s2.charAt(right) - 'a']++;

            // Keep window size fixed
            if(right - left + 1 > s1.length()){
                windowCount[s2.charAt(left) - 'a']--;
                left ++;

            }

            // Compare frequencies
            if(Arrays.equals(s1Count, windowCount)){
                return true;
            }
        }
        return false;
    }
}
