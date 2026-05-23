class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();

        if(p.length() > s.length()){
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        // Frequency count for s1
        for (char c : p.toCharArray()){
            pCount[c - 'a']++;
        }

        int left = 0;
        for(int right = 0; right < s.length(); right++){

            // Add current character to the window
            windowCount[s.charAt(right) - 'a']++;

            // Keep window size fixed
            if(right - left + 1 > p.length()){
                windowCount[s.charAt(left) - 'a']--;
                left ++;

            }

            // Compare frequencies
            if(Arrays.equals(pCount, windowCount)){
                result.add(left);
            }
        }
        return result;

    }
}
