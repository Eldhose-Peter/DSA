package Sorting;

//Select the most minimum element and place it in front  of the array
public class selectionSort {
    
    public static void main(String[] args) {
        
        int arr[] = {3,6,4,1,3,9,7,5};
        arr = selection(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }

    public static int[] selection(int arr[])
    {
        int i,j,min,temp;
        int n= arr.length;
        for(i=0;i<n-1;i++)
        {
            min = i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        return arr;
    }

  
}
