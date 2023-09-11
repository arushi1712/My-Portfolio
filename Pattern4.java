package Type2;

public class Pattern4 {
    public static void main(String[] args)
    {
        int i,j; char ch;
        for(i=1; i<=5;i++)
        {
            ch='a';
            for(j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ++ch;
            }
            System.out.println();
        }
    }
}
