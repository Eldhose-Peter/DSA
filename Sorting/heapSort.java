package Sorting;

class heapSort
{
    public static void main(String[] args) {
        
        int arr[] = {3,6,4,1,3,9,7,5};
        sort(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
    //if i is the root
    //2*i+1 is the left child
    //2*i+2 is the right child

    //for a ith node the parent is i/2

    public static void sort(int[] arr)
    {
        int n = arr.length;
        int i;
        //Build heap rearrange the array
        //here (n/2-1) gives the last non-leaf node from the bottom.
        //which is the parent of the last leaf node.
        for(i=n/2-1;i>=0;i--)
        {
            heapify(arr, n, i);
        }

        //heap sort
        //placing the largest element at end of array.
        //by swaping the root and lowest node.
        for (i = n - 1; i >= 0; i--) 
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
      
            // Heapify root element. 
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr,int n ,int i)
    {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n&&arr[left]>arr[largest])
        {
            largest=left;
        }

        if(right<n&&arr[right]>arr[largest])
        {
            largest=right;
        }

        //if root is not the largest then swap
        if(largest!=i)
        {
            int temp = arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr, n, largest);
        } 
    }
}