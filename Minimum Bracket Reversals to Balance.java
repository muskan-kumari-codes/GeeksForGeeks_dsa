class Solution {
    public int countMinReversals(String s) {
        if(s.length()%2==1){
            return -1;
        }
        
        Deque<Character> st = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch=='}' && !st.isEmpty() && st.peek()=='{'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        
        int open = 0;
        int close = 0;
        
        while(!st.isEmpty()){
            if(st.peek()=='{'){
                open++;
            }else{
                close++;
            }
            st.pop();
        }
        
        if(open%2==0){
            return (open/2 + close/2);
        }
        else{
            return (open-1)/2 + 2 + (close-1)/2;
        }
    }
}
