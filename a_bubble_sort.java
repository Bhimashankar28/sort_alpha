/*
O(n)^2
sorting is arrangment of product in particular order
1- bubble sort
2-selection sort
3-insertion sort
4-counting sort

bubble sort- large element comes to the end of array by swapping with adjecent element

5 4 1 3 2        4 1 3 2 5        1 3 2 4 5         1 2 3 4 5
4 5 1 3 2        1 4 3 2 5        1 3 2 4 5         1 2 3 4 5
4 1 5 3 2        1 3 4 2 5        1 2 3 4 5
4 1 3 5 2        1 3 2 4 5
4 1 3 2 5

o th tern        1th tern         2nd tern           4th tern
o to n-2         o to n-3         0 to n-4           0 to n-5



*/



import java.util.*;
public class a_bubble_sort
{
    public static void bubbleSort(int arr[])
    {
        for(int turn=0; turn< arr.length-1; turn++)   //outer loop it will go 3  + it go n times
        {
            for(int j=0;j< arr.length-1-turn;j++)
            {
                if(arr[j] > arr[j+1])  // it determine next no is greater than it or not if yes then it go  + it go n-1-turns time
                {
                    //swap code
                    int temp =arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                }
            }
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
      bubbleSort(arr);
      printarr(arr);
    }
}
