class Solution {
    static final long mod = 1_000_000_007L;
    
    static long multi(int i, int count, int k, long result){
        if(k==count) return result;
        result = (result*i)%mod;
        return multi(i+1, count, k+1, result);
    }
    
    static long num(int n, long ans, int i, int count){
        
        if(count==n) return ans%mod;
        
        ans = (ans+multi(i, count+1, 0, 1))%mod;
        
        
        return num(n, ans, i+count+1, count+1);
    }
    
    public int sequence(int n) {
        // code here
       return (int)num(n,0,1,0); 
    }
};
