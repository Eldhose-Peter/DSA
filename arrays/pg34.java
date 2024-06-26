package arrays;
public class pg34{
    public static void main(String[] args) {
        
    }


static int trappingWater(int arr[], int n) { 
        
    int vol = 0,height = 0,maxHeight = 0,i,secondHeight=0,secPos=-1,maxPos=-1;
    
    for(i=0;i<n-1;i++)
    {
        height = arr[i];
        
        if(height > maxHeight)
        {
            secondHeight = maxHeight;
            secPos =maxPos;
            maxHeight=height;
            maxPos=i;
           
        }
        
        else
        {
            if(height > secondHeight)
            {
                secondHeight=height;
                secPos = i; 
            }
            
            vol+=maxHeight-height;
            
        }
        
        if(secPos>maxPos)
        {
            vol-=(maxHeight-secondHeight)*(secPos-maxPos-1);
        }
      
    }
      //What if last height is max height or secHeight???
       
        if(i!=secPos&&i!=maxPos)
        {
            if(secPos>maxPos)
            {
                vol-=(secondHeight-arr[i])*(i-secPos-1);
            }
            else
            {
                 vol-=(maxHeight-arr[i])*(i-maxPos-1);
            }
        }
        
    return vol;
    
} 

}
