package recursion;

public class reverseNum {
    public static void main(String[] args) {
        System.out.println(reverse(1234,4));
    }

    public static int reverse(int num,int digits) {

        if(num<10)
            return num;

        int digit = num%10;
        int rev = reverse(num/10,--digits);

        return (int)Math.pow(10,digits)*digit+rev;
        
    }
}
