class Solution {
    public boolean checkRedundancy(String s) {
        
        Deque<Character> st = new ArrayDeque<>();
        
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='+' || ch=='*' || ch=='/' || ch=='-'){
                st.push(ch);
            }
            else if(ch==')'){
                
                boolean operantFound = false;
                
                while(!st.isEmpty() && st.peek()!='('){
                    int temp = st.peek();
                    if(temp=='+' || temp=='-' || temp=='*' || temp=='/'){
                        operantFound = true;
                    }
                    st.pop();
                }
                
                if(operantFound==false){
                    return true;
                }else{
                    st.pop();
                }
                
            
            }
            
        }
        return false;
    }
}
