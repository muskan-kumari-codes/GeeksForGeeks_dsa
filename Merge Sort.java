class Solution {
    static void merge(int[] arr, int s, int e, int mid){
        int leftArrLen = mid - s +1;
        int rightArrLen = e - mid;
        int[] leftArr = new int[leftArrLen];
        int[] rightArr = new int[rightArrLen];
        //copying left sorted arr
        int k = s;
        for(int i=0; i<leftArrLen; i++){
            leftArr[i] = arr[k];
            k++;
        }
        //copying right arr
        k = mid+1;
        for(int i=0; i<rightArrLen; i++){
            rightArr[i] = arr[k];
            k++;
        }
        //merging
        k = s;
        int i = 0;
        int j = 0;
        while(i<leftArrLen && j<rightArrLen){
            if(leftArr[i] > rightArr[j]){
                arr[k] = rightArr[j];
                k++;
                j++;
            }else{
                arr[k] = leftArr[i];
                i++;
                k++;
            }
        }
        while(i<leftArrLen){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j<rightArrLen){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    
    public void mergeSort(int arr[], int l, int r) {
        int s = l;
        int e = r;
        if(s>=e) return;
        int mid = (s+e)/2;
        // left sort
        mergeSort(arr, s, mid);
        //right sort
        mergeSort(arr, mid+1, e);
        //merge
        merge(arr, s, e, mid);
        
    }
}
