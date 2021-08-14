public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr=new int[]{10,3,5,7,1,9};
        int n=arr.length;
        int temp,j;
        for(int i=1;i<n;i++)
        {
            temp=arr[i];
            j=i-1;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j--;
            arr[j+1]=temp;

        }
        }
     for(int num:arr)
     {
         System.out.println(num);
     }
    }
}
