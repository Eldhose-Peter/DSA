package arrays;

public class hospital {
    
    public static void main(String[] args) {
        int n =3;
        int arr[] = {1,4,5};
        System.out.println(maxTime(n, arr));
    }

    static int maxTime(int n,int[] arr){
        int max = 0;
        int left=0;
        int right=n-1;
        int maxleft =0;
        int maxright=0;

        while(left<right){
            int distance;
            distance = arr[left]+arr[right]+right-left;
            if(distance>max){
                max = distance;
            }

            if(arr[maxleft]<arr[left]){
                maxleft=left;
            }
            if(arr[maxright]<arr[right]){
                maxright=right;
            }
            distance = arr[maxleft]+arr[maxright]+maxright-maxleft;
            if(distance>max){
                max=distance;
            }

            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }

}
