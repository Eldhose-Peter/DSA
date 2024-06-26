package dp;

import  java.util.HashSet;

//partiton the given array into 2 arrays with equal sum

class partitionSum
{

    public static void main(String[] args) {
        
        //int arr[]={1,5,11,5};
        int arr[] = {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,99,97};
        System.out.println(partition(arr));

    }

    private static boolean partition(int arr[])
    {
        int n = arr.length;
        int leftsum =0;
        int rightsum = 0;
        HashSet<Integer> hMap = new HashSet<>();
 
        for(int a:arr)
        {
            rightsum+=a;
        }
        return part(arr,leftsum,rightsum,0,n,hMap);
    }


    private static boolean part(int arr[],int leftsum,int rightsum,int pos ,int n,HashSet<Integer> hMap)
    {   
        

        if(leftsum==rightsum)
            return true;

        if(hMap.contains(leftsum))
            return false;
        
        if(pos==n||leftsum>rightsum){
            hMap.add(leftsum);
            return false;
        }
        

        if(part(arr,leftsum+arr[pos],rightsum-arr[pos],pos+1,n,hMap))
        {
            return true;
        }
        else
        {   
            hMap.add(leftsum+arr[pos]);
            return part(arr,leftsum,rightsum,pos+1,n,hMap);
        }
    }
}
