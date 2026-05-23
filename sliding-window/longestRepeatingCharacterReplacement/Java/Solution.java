class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int maxFreq = 0;
        int longest = 0;

        int[] count = new int[26];

        for (int right = 0; right < s.length(); right++) {

            // Add current character to window
            count[s.charAt(right) - 'A']++;

            // Track highest frequency character in window
            maxFreq = Math.max(maxFreq,
                    count[s.charAt(right) - 'A']);

            // If replacements needed > k, shrink window
            while ((right - left + 1) - maxFreq > k) {

                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update answer
            longest = Math.max(longest,
                    right - left + 1);
        }

        return longest;
    }
}
