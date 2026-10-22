class Solution {
    static int sum(int n, int i, int sum){
        sum+=i;
        if(i==n) return sum;
        
        return sum(n, i+1, sum);
    }
    public int recursiveSum(int n) {
        // code here
        int ans = sum(n, 0, 0);
        return ans;
    }
}
