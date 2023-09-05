/*
selection sort= pick the smallest (from the unsorted), put it at the beginning
5 4 1 3 2
1 5 4 3 2
1 2 5 4 3
1 2 3 5 4
1 2 3 4 5

for(int i=0 to n-2)
smallest=MAX
for(j=i+1 to n-1)
unsorted arr=start
 */





import java.util.*;
public class b_selection_sort
{
    public static void selectionSort(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)  // arrays go to number -1
        {
            int minPos =i;   // we will consider minimum position is 1st index that is =i
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[minPos] > arr[j])  // we check if minimum position arrays is small then we put
                {
                    minPos =j;
                }
            }
            // swap code
            int temp= arr[minPos];
            arr[minPos] = arr[i];
            arr[i]=temp;
        }
    }
    public static void printarr(int arr[])  // array printing
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[]={5,4,1,3,2};
        selectionSort(arr);
        printarr(arr);
    }
}


