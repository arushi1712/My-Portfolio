package Type2;

public class Pattern5 {
    public static void main(String [] args)
    {
        char ch='a';
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ++ch;
            }
            System.out.println();
        }
    }
}
