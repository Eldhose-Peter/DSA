package arrays;

public class findDuplicate {
    
    public static void main(String[] args) {
        //elements are in the range 1 to n
        int arr[] = {3,1,3,4,2};
        System.out.println(find(arr));
    }

    static int find(int[] arr){
        int temp;
        while(arr[0]!=arr[arr[0]]){
            temp =arr[arr[0]];
            arr[arr[0]]=arr[0];
            arr[0]=temp;
        }
        return arr[0];
    }
}
