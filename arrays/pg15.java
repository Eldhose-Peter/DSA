package arrays;


public class pg15{

    //minimum number of jumps to reach the end of the array
    public static void main (String args[])
    {
        int arr[] = {1,4,3,2,6,7 };
        //output = 3

        System.out.println(minJump(arr, arr.length));
    }


    //recursive programing
    static int calcJump(int arr[],int l,int h)
    {
        if(h==l)
        {
            return 0;
        }
        if(arr[l]==0)
        {
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;

        for(int i=l+1;((i<=h)&&(i<=(arr[l]+l)));i++)
        {
            int jumps = calcJump(arr,i,h);
            
            if((jumps+1)<min && jumps!=Integer.MAX_VALUE)
            {
                min=jumps+1;
            }
        }
        return min;

    }

    //dynamic programing
    static int minJump(int arr[],int n)
    {
            int jump[] = new int[n];
            int i,j;

            if(n==0||arr[0]==0)
            {
                return Integer.MAX_VALUE;
            }

            jump[0]=0;

            //find min no: of jumps required to move from arr[0] to arr[i]
            //and store it in jump[j]
            for(i=1;i<n;i++)
            {
                jump[i]= Integer.MAX_VALUE;

                for(j=0;j<i;j++)
                {
                    if(i<=j+arr[j]&&jump[j]!=Integer.MAX_VALUE)
                    {
                        jump[i]=Math.min(jump[i], jump[j]+1);
                        break;
                        
                    }
                }

            }
            return jump[n-1];
    }
}