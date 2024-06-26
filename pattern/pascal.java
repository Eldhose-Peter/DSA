package pattern;

class pascal{

    public static void main(String[] args) {
        func(5);
    }

    public static void func(int rows)
    {
        int i=0,j=0;

        for(i=1;i<=rows;i++)
        {
            int cols=i;
            for(j=1;j<=cols;j++)
            {
                System.out.print(j+" ");
            }
        }
        System.out.println("");
    }

}