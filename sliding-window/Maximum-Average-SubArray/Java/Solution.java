class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum = 0;
        // adding the first k elements
        // This is our first window 
        for (int i = 0; i< k; i++){
            sum += nums[i];
        }

        int maxSum = sum;

        for (int j = k; j < nums.length; j++){
            sum -= nums[j - k]; // removing the first element 
            sum += nums[j];  // adding the new element
            maxSum = Math.max(maxSum, sum);
        }
        
        return (double) maxSum / k;
    }
}
