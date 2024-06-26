package dp;

import java.util.Arrays;

//Coin change problem
//Maximum number of ways to achieve a coin change

//Given a value N, find the number of ways to make 
//change for N cents, if we have infinite supply of each of 
// S = { S1, S2, .. , SM } valued coins. 


class coinChange{
    public static void main(String[] args) {
        //int n = 4;
        //int arr[]= {1,2,3};
        //output = 4

        int n = 10; 
        int arr[] ={2,5,3,6};
        //output = 5

        System.out.println(count(arr,arr.length,n));

    }

    //Bottom Up Approach

    public static int count(int arr[],int m,int n)
    {
        int a[] = new int[n+1];
        Arrays.fill(a,0);
        int i,j;

        //number of ways to reach 0 is 1
        a[0]=1;

        for(i=0;i<m;i++)
        {   
            //locations in a[] where we can reach with arr[i]

            for(j=arr[i];j<n+1;j++)
            {   
                //number of ways to reach j
                a[j]+=a[j-arr[i]];
            }
        }

        return a[n];
    }







    //Top Down Approach
/*
    public static long count(int S[],int c,int m ,int n)
    {
        if(n==0)
            return 1;

        else if(n<0)
            return 0;
        
        for(int i=0;i<m;i++)
        {   
            if(S[i]<=n)
            {
                c += count(S,c, m, n-S[i]);
            }
        }
        return c;
    }
    */
    



    


}