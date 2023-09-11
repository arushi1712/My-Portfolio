package Type1;

public class Pattern_4 {
    public static void main(String[] args)
    {
        char ch='a';
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            ch='a';
            System.out.println();
        }
    }
}
