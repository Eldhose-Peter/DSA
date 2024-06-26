package arrays;
import java.util.*;

public class days {
    
    public static void main(String[] args) {
        System.out.println(func(-15,"Mon"));
    }

    public static String func(int num,String day)
    {
        HashMap<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1,"Mon");
        map1.put(2,"Tue");
        map1.put(3,"Wed");
        map1.put(4,"Thur");
        map1.put(5,"Fri");
        map1.put(6,"Sat");
        map1.put(7,"Sun");

        HashMap<String,Integer> map2 = new HashMap<String,Integer>();
        map2.put("Mon",1);
        map2.put("Tue",2);
        map2.put("Wed",3);
        map2.put("Thur",4);
        map2.put("Fri",5);
        map2.put("Sat",6);
        map2.put("Sun",7);
 

        int d = map2.get(day);

        //for positive
        int x;
        if(num>=0)
        {
            
            x = num%7;
            x = d+x;
            x =x%7;

            if(x==0)
            {
                x=7;
            }
        }

        else
        {
            num*=-1;
            x= num%7;
            x=7-x;

            x = d+x;
            x =x%7;

            if(x==0)
            {
                x=7;
            }


        }
        return map1.get(x);
    }
}
