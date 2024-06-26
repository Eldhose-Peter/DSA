package Sorting;

//It is a divide and conquer algorithm.
//it chooses a pivot element and partitions the given array around the pivot element.
public class quickSort {
    public static void main(String[] args) {
        
        int arr[] = {3,6,4,1,3,9,7,5};
        quick(arr,0,arr.length-1);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }

    public static void quick(int arr[],int left,int right)
    {
        if(left<right)
        {
            int pivot = arr[(left+right)/2]; //can choose any random element as pivot.Just choosing mid value here.
            int index = partition(arr,left,right,pivot);

            quick(arr, left, index-1); //now sort the left side of pivot.
            quick(arr, index+1, right); //then right side.

        }
    }

    public static int partition(int arr[],int left,int right,int pivot)
    {
        while(left<=right)
        {
            while(arr[left]<pivot)
            {
                left++;
            }
            while(arr[right]>pivot)
            {
                right--;
            }
            if(left<=right)
            {
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;

                right--;
                left++;
            }

        }
        return left-1; //returns the pos where pivot is placed.(ie,correct position)
    }

    
}
