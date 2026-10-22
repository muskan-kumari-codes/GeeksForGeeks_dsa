class Solution {
    static int reverse(int n, int ans){
        if(n==0) return ans;
        int digit = n%10;
        ans = ans*10 + digit;
        return reverse(n/10, ans);
    }
    
    static int power(int n, int reverse, int ans){
        if(reverse==0) return ans;
        ans=ans*n;
        return power(n, reverse-1, ans);
    }
    
    public int reverseExponentiation(int n) {
        int rev = reverse(n, 0);
        int result = power(n, rev, 1);
        return result;
    }
}
