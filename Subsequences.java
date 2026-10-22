class Solution {
    static void getSubsequences(String s, StringBuilder output, int i, ArrayList<String> list){
        if(i>=s.length()){
            String ans = output.toString();
            list.add(ans);
            return;
        }
        
        char ch = s.charAt(i);
        
        output.append(ch);
        getSubsequences(s, output, i+1, list);
        
        output.deleteCharAt(output.length()-1);
        getSubsequences(s, output, i+1, list);
    }
    public ArrayList<String> powerSet(String s) {
        // code here
        int i = 0;
        ArrayList<String> list = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        getSubsequences(s, output, i, list);
        Collections.sort(list);
        return list;
    }
}
