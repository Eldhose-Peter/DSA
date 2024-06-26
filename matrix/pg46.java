package matrix;

//median of a sorted matrix.
public class pg46 {
    
    public static void main(String[] args) {
        
       int M[][] = {{1, 3, 5}, 
     {2, 6, 9}, 
     {3, 6, 9}};

     System.out.println(median(M,3,3));

    }

    static int median(int matrix[][], int r, int c) {
        
        int i,j,index,k,size = r*c;
        int[] arr = new int[size];
    
        //insert first row        
        for(k=0;k<c;k++)
        {
            arr[k]=matrix[0][k];
        }
    
        for(i=1;i<r;i++)
        {
            //matrix[i][j] into arr[index]
            j=0;
            index=0;
            while(j<c&&index<=k)
            {
                if(matrix[i][j]<arr[index])
                {
                    insert(arr,index,k,matrix,i,j);
                    k++;
                    j++;
                }
                else
                {
                    index++;        
                }
            
            }
            
            while(j<c)
            {
                insert(arr,k,k,matrix,i,j);
                j++;
                k++;
            }
            
        }
        int median = (size/2)-2;

        for(i=0;i<size;i++)
            System.out.print(arr[i]);


        return arr[median];
        
        
    }
    public static void insert(int arr[],int index,int k,int matrix[][],int i,int j)
    {
        while(k>index)
        {
            k--;
            arr[k+1]=arr[k];
            
        }
        arr[k]=matrix[i][j];
    }
}
