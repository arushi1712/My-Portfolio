package Type1;

public class Pattern_9
{
    public static void main(String[] args)
    {
        int num,i,j;
        for(i=1;i<=5;i++)
        {
            if(i%2==0)                                      // when i is even
            {
                num=2;
                for(j=1;j<=5;j++)
                {
                    System.out.print(num+" ");
                    num+=2;
                }
                System.out.println();
            }
            else                                                // when is odd
            {
                num=5;
                for(j=1;j<=5;j++)
                {
                    System.out.print(num + " ");
                    num+=5;
                }
                System.out.println();
            }
        }
    }
}
