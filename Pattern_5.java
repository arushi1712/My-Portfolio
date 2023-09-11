package Type1;

public class Pattern_5 {
    public static void main(String[] args)
    {
        char ch;
        int i,j;
        for(i=1;i<=5;i++)
        {
            if(i==2 || i==4)
            {
                ch='b';
                for(j=1;j<=5;j++)
                {
                    System.out.print(ch + " ");
                }
            }
            else
            {
                ch='a';
                for(j=1;j<=5;j++)
                {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
}
