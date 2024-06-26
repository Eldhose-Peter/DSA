package arrays;

public class primeRange {
    // print sum of prime numbers upto a range n
    public static void main(String[] args) {
        int n = 100;
        System.out.println(range(n));
    }
    public static int range(int n){

        int arr[] = new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=Math.sqrt(n);i++){

            if(arr[i]==0){
                if(isPrime(i)){
                    //then set multiples of i as 1;
                    //System.out.println(a);
                    for(int j=i+i;j<n;j+=i)
                        arr[j]=1;
                }
            }

        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                sum+=i;
            }
        }   
        return sum;
    }

    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}


