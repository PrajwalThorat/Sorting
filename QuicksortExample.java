public class QuicksortExample{
    public static void main(String[] args){
        int[] arr = {7,18,3,16,24,12,25};
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(int[] arr, int min, int max){
        if(min<max){
            int pivot = arr[min];
         
            int i = min;
            int j = max;
         
            while(i<j){
                while(arr[i]<=pivot){
                    i++;
                }
                while(arr[j]>=pivot){
                    j--;
                }
        
                if(i<j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[j];
            arr[j] = arr[min];
            arr[min] = temp;
         
             quickSort(arr,min,j-1);
             quickSort(arr,j+1,max);
         }
    }

}