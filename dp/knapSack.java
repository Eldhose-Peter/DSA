package dp;
 //Function to return max profit that can be put in knapsack of capacity W.
public class knapSack {

    public static void main(String[] args) {

        int N = 3;
        int W = 50;
        int profit[] = {60,100,120};
        int weight[] = {10,20,30};
        //Output: 220

        int mem[][] = new int[W+1][N+1];
        int i,j;
        for(i=0;i<W+1;i++)
            for(j=0;j<N+1;j++)
                mem[i][j]=-1;


        System.out.println(ks(W, weight, profit, N,mem));
        
    }
   
    //recursion method
/*   static int ks(int W, int wt[], int val[], int n) 
    { 

        if(n<0)
            return 0;

        if(wt[n]>W)
            return ks(W, wt, val, n-1);

        return Math.max(ks(W, wt, val, n-1),val[n]+ks(W-wt[n], wt, val, n-1));

    } 

*/
    //Try now with memoization;
    static int ks(int W, int wt[], int val[], int n,int mem[][]) 
    { 
       

        if(mem[W][n]!=-1)
            return mem[W][n];

        if(n==0||W==0)
            return 0;

        if(wt[n-1]>W)
            mem[W][n] = ks(W, wt, val, n-1,mem);

        else
            mem[W][n]= Math.max(ks(W, wt, val, n-1,mem),val[n-1]+ks(W-wt[n-1], wt, val, n-1,mem));

        return mem[W][n];
    } 
}
