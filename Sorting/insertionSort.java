package Sorting;

//Virtually split into sorted and unsorted path. Region less than i is sorted.
//value is taken form unsorted path and inserted in correct position in sorted path.
public class insertionSort {
    public static void main(String[] args) {
        
        int arr[] = {3,6,4,1,3,9,7,5};
        arr = insertion(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }

    public static int[] insertion(int arr[])
    {
        int i,j,key,n=arr.length;
        for(i=1;i<n;i++)
        {
            key = arr[i];
            j=i-1;

            while(j>=0&&arr[j]>key)
            {
                arr[j+1]=arr[j]; 
                j--;
            }
            arr[j+1]=key;

        }
        return arr;
    }
}
