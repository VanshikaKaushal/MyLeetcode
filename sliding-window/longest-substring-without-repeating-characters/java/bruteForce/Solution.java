class Solution {

    public int lengthOfLongestSubstring(String s) {

       if(s.length() == 0){
        return 0;
       } 
        
       String result = "" + s.charAt(0);
       int maxLength = 1;
    
       for(int i = 1; i < s.length(); i++){

            if(result.indexOf(s.charAt(i)) == -1){
                result += s.charAt(i);
                

            }else {
                
                maxLength = Math.max(maxLength, result.length());
                result = result.substring((result.indexOf(s.charAt(i)) + 1));
                result += s.charAt(i);
                
            }
            maxLength = Math.max(maxLength, result.length());

       }
       return maxLength;
    }
}
