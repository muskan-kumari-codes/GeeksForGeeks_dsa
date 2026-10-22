class Solution {
    static void getSum(int[] arr, int sum, int i, ArrayList<Integer> list){
        if(i==arr.length){
            list.add(sum);
            return;
        }
        
        //exclude
        getSum(arr, sum, i+1, list);
        
        //include
        getSum(arr, sum+arr[i], i+1, list);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        getSum(arr, 0, 0, list);
        Collections.sort(list);
        return list;
        
    }
}
