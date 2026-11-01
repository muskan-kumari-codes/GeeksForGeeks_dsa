class Solution {
    public void quickSort(int[] arr, int low, int high) {
        
        int s = low;
        int e = high;
        if(s>=e){
            return;
        }
        
        //pivot element
        int pivotIdx = partition(arr,s,e);
        //left sort
        quickSort(arr, s, pivotIdx-1);
        //right sort
        quickSort(arr, pivotIdx+1, e);
    }

    private int partition(int[] arr, int s, int e) {
        int pivot = arr[s];
        int count = 0;
        
        for(int i=s+1; i<=e; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }
        
        int correctPos = count + s; 
        
        //swapping pivot element to it's right position
        int temp = arr[s];
        arr[s] = arr[correctPos];
        arr[correctPos] = temp;
        
        int i = s;
        int j = e;
        while(i<correctPos && j>correctPos){
            while(arr[i] <= pivot && i<correctPos){
                i++;
            }
            while(arr[j] > pivot && j>correctPos){
                j--;
            }
            
            if(i<correctPos && j>correctPos){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return correctPos;
    }
}
