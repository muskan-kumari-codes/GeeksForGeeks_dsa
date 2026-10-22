class Solution {
    static ArrayList<Integer> sub(int n, int ans, ArrayList<Integer> list){
        list.add(ans);
        if(ans<=0) return list;
        
        return sub(n, ans-5, list);
    }
    static ArrayList<Integer> add(int n, int ans, ArrayList<Integer> list){
        if(ans==n) return list;
        ans+=5;
        list.add(ans);
        
        return add(n, ans, list);
    }
    public ArrayList<Integer> pattern(int n) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        sub(n,n,list);
        
        if(n>0){
            add(n, list.get(list.size()-1), list);
        }
        return list;
    }
}
