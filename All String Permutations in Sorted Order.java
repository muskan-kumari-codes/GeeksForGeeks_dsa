class Solution {
    
    static void solve(String s, String output, ArrayList<String> list){
        if(s.isEmpty()){
            list.add(output);
            return;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String rem = s.substring(0,i) + s.substring(i+1);
            solve(rem, output+ch, list);
        }
    }
    public ArrayList<String> permutation(String s) {
        ArrayList<String> list = new ArrayList<>();
        solve(s, "", list);
        Collections.sort(list);
        return list;
    }
}
