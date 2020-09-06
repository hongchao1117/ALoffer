package Array;

public class qucikSort {
    public void qucikSort(int[] arr,int start,int end){
        if (start<end){
            int low = start;
            int high = end;
            int standard = arr[low];
            while (low<high){
                while (low<high && standard<=arr[high]){
                    high--;
                }
                arr[low] = arr[high];
                while (low<high && standard>=arr[low]){
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = standard;
            qucikSort(arr,start,low);
            qucikSort(arr,low+1,end);
        }
    }
}
