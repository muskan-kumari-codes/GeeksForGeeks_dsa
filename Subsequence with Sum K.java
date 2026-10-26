class Solution {
    static boolean solve(int[] arr, int k, int sum, int i){
        if(i>=arr.length){
            if(sum==k) return true;
            return false;
        }
        boolean exclude = solve(arr, k, sum, i+1);
        boolean include = solve(arr, k, sum+arr[i], i+1);
        return exclude || include;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        return solve(arr, k, 0, 0);
    }
}
