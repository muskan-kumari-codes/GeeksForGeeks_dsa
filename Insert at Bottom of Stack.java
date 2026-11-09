class Solution {
    public static void helper(Stack<Integer> st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        
        int topVal = st.peek();
        st.pop();
        helper(st, val);
        st.push(topVal);
    }
    
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        int val = x;
        helper(st, val);
        return st;
    }
}
