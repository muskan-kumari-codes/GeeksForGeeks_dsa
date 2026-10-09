class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> roots = new ArrayList<>();
        int d = b*b - 4*a*c;
        if(d<0){
            roots.add(-1);
            return roots;
        }
        int root1 = (int)Math.floor(
            (-b + Math.sqrt(d))/(2.0*a)
            );
        int root2 = (int)Math.floor(
            (-b - Math.sqrt(d))/(2.0*a)
            );
        roots.add(Math.max(root1, root2));
        roots.add(Math.min(root1, root2));
        return roots;
    }
}
