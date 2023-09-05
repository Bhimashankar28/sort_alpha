import java.util.Collections;
import java.util.Arrays;
public class d_inbuild_sort
{
    public static void printarr(Integer arr[])  // array printing
    {
        for(Integer i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Integer arr[] = { 5,4, 1, 3, 2};
        /*
        Arrays.sort(arr);  // sort 1 2 3 4  5
        Arrays.sort(arr,0,3); // sort 1 3 5 4 2
       Arrays.sort(arr, Collections.reverseOrder());

         */
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printarr(arr);
    }
}
