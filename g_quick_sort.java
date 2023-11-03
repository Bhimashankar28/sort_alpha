public class g_quick_sort
{
    public static void printArr(int arr[])
    {
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei)
    {
        if(si>=ei)
        {
            return ;
        }
        //last element

        int pidx = partition(arr,si,ei);
        quickSort(arr,si,pidx-1); //left
        quickSort(arr,pidx+1,ei);  //right
    }
    public static int partition(int arr[], int si, int ei)
    {
        int pivot=arr[ei];
        int i=si-1; // to make place for element smaller than pivot
        for(int j=si; j<ei; j++)
        {
            if(arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[]={6,3,4,9,2,1,7,5,8};
        quickSort(arr,0 ,arr.length-1 );
        printArr(arr);
    }


}
