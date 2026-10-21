class Solution {
    static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }
    public ArrayList<Integer> fibonacciNumbers(int n) {
       ArrayList<Integer> list = new ArrayList<>(); 
       for(int i=0; i<n; i++){
           list.add(fib(i));
       }
       return list;
    }
}
