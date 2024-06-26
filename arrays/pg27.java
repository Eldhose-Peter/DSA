package arrays;


import java.util.ArrayList;

public class pg27 {

    public static void main(String[] args) {
        ArrayList<Integer> a = factorial(6);

        System.out.println(a);
    }

    static ArrayList<Integer> factorial(int N){
        int i=0;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int num= N;
        while(num>0)
        {
            arrList.add(num%10);
            num=num/10;
        }
        
        int j,carry,digit;
        
        
        for(i=2;i<N;i++)
        {
            carry=0;
            for(j=0;j<arrList.size();j++)
            {
                digit = arrList.get(j);
                digit*=i;
                
                digit+=carry;
                
                
                if(digit>9)
                {
                    arrList.set(j,digit%10);
                    carry = digit/10; 
                }
                else
                {
                    arrList.set(j,digit);
                    carry=0;
                }
                
            }
            
            while(carry>0)
            {
                arrList.add(carry%10);
                carry=carry/10;
            }

            System.out.println(arrList);
            
            
        }
       
        return arrList;
    }
    
}
