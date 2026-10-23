class Solution {
    static List<Long> solve(long n, List<Long> list){
        list.add(n);
        if(n==1) return list;
        
        if(n%2==0){
            n = (long)Math.sqrt(n);
        }else{
            n = (long)Math.pow(n,1.5);
        }
        return solve(n, list);
    }
    static List<Long> jugglerSequence(long n) {
        
        List<Long> list = new ArrayList<>();
        return solve(n, list);
    }
}
