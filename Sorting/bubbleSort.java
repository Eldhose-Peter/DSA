package Sorting;

//swap adjacent elements if they are in the wrong order
//placing the biggest element in the end after each iteration
public class bubbleSort {

    public static void main(String[] args) {
        
        int arr[] = {3,6,4,1,3,9,7,5};
        arr = bubble(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }

    public static int[] bubble(int arr[])
    {
        int i ,j,temp,n=arr.length;
        
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
        
    }
    
}
