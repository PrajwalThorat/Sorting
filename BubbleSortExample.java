public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr=new int[]{10,2,3,5,7};
        int pass=1;
        int temp;
        int length=arr.length;
        //outer loop will be for no of pass
        //inner loop will be for no of comparisons

        while(pass<=length-1)  //n
        {
            for(int j=0;j<=length-1-pass;j++)//n
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            pass++;
        }
        for(int num:arr)
        {
            System.out.println(num);
        }
        }





    }

