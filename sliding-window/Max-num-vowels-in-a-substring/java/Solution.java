class Solution {

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' ||
               c == 'i' || c == 'o' ||
               c == 'u';
    }

    public int maxVowels(String s, int k) {

        int left = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            count += (isVowel(s.charAt(i))) ? 1 : 0;
        }

        int maxVowel = count;

        for (int right = k; right < s.length(); right++) {

            count -= (isVowel(s.charAt(left))) ? 1 : 0;
            left++;

            count += (isVowel(s.charAt(right))) ? 1 : 0;

            maxVowel = Math.max(maxVowel, count);
        }

        return maxVowel;
    }
}
