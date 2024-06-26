package Sorting;

public class quickSort2 {
    public static void main(String[] args) {
        
        int arr[] = {3,6,4,1,3,9,7,5};
        quick(arr,0,arr.length-1);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
    
    static void quick(int[] arr, int left,int right){

        if(left<right){

            int pivot = arr[right]; //here we take the rightmost element as the pivot element
            int index = partition(arr,left,right,pivot);
            
            quick(arr, left, index-1); //now sort the left side of pivot.
            quick(arr, index+1, right); //then right side.

        }
    }

    static int partition(int[] arr,int low,int high, int pivot){
        int i = (low - 1); 
  
        for(int j = low; j <= high - 1; j++)
        {
              
            // If current element is smaller 
            // than the pivot
            if (arr[j] < pivot) 
            {
                  
                // Increment index of 
                // smaller element
                i++; 
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return (i + 1);

    }
}

