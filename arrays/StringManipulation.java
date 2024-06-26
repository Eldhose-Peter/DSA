package arrays;

public class StringManipulation {
    
    public static void main(String[] args) {
        String s = new String("Arjun");
        func(s);
    }

    static void func(String s1){
        System.out.println(s1);
        char[] c = s1.toCharArray();
        c[0]='E';
        String s2 = String.valueOf(c);
        System.out.println(s2);
    }
}
