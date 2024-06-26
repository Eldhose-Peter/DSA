package dp;
import java.util.*;

public class backtracking {
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        List<List<Integer>> list = new ArrayList<>();
        subset(arr,arr.length,list, new ArrayList<>(), 0);
        System.out.println(list.toString());


    }

    public static void subset(int[] arr,int n,List<List<Integer>> list,List<Integer> result,int start){

        list.add(new ArrayList<>(result));
        for(int i=start;i<n;i++){
            result.add(arr[i]);
            subset(arr,n,list,result,i+1);
            result.remove(result.size()-1);
        }
    }
}
