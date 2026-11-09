class Solution {
    
    public static void insertAtBottom(Stack<Integer> st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int topVal = st.peek();
        st.pop();
        insertAtBottom(st, val);
        st.push(topVal);
    }
    
    public static void helper(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int val = st.peek();
        st.pop();
        helper(st);
        insertAtBottom(st, val);
    }
    
    public static void reverseStack(Stack<Integer> st) {
        // code here
        helper(st);
    }
}
