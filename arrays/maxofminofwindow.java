package arrays;

public class maxofminofwindow {
   

public static void main(String[] args) {
    int arr[] = {10, 20, 30, 50, 10, 70, 30} ;
    int size =2;
    System.out.println(func(arr,size));
}
static int func(int[] arr,int size){

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int minIndex=-1;
    int i=0;
    int len = arr.length;
    for(i=0;i<size;i++){
        if(arr[i]<=min){
            min = arr[i];
            minIndex=i;
        }
    }
    max =min;

    int left =1;
    int right =i;
    while(right<len){
        if(arr[right]<=min){
            min = arr[right];
            minIndex=right;
        }
        if(minIndex<left){
            minIndex = getIndex(arr,left,right);
            min = arr[minIndex];
        }

        if(min>max){
            max =min;
        }
        left++;
        right++;

    }

    return max;
}
static int getIndex(int[] arr ,int left, int right){

    int min = Integer.MAX_VALUE;
    int minIndex=-1;
    for(int i=left;i<=right;i++){
        if(min>=arr[i]){
            min = arr[i];
            minIndex =i;
        }
    }

    return minIndex;
}


}