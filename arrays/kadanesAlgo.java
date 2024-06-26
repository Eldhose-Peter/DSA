package arrays;

public class kadanesAlgo {
    
    //maximum contigiuos sum of subarray
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int maxSum = maxSubarray(arr);
        System.out.println(maxSum);
    }

    static int maxSubarray(int[] arr){

        int maxSum = arr[0];
        int currSum = arr[0];

        for(int i=1;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;

    }

}
