package arrays;


public class pg10 {
    
    public static void main(String args[])
    {
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        int i=0,temp,n=arr.length;

        int j=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                if(i!=j)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
                j++;
            }
        
        }

        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    } 
}
