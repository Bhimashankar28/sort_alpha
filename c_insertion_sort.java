/*
On^2
insertion sort= pick an element (from unsorted part)& place in the right position in sorted part
using tempary memory

 */




import java.util.*;
public class c_insertion_sort
{
    public static void insertionSort(int arr[])
    {
        for(int i=1; i< arr.length; i++)
        {
            int curr = arr[i];
            int prev = i-1;
            // Finding out the correct positon to insert
            while(prev >=0 && arr[prev] > curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
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
        insertionSort(arr);
        printarr(arr);
    }
}


