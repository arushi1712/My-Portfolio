package Type3;

public class Pattern_14
{
    public static void main(String[] args)
    {
        int i=0,j=0, num=1, temp=5;
        char ch='a';
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=temp;j++)
            {
                if (j % 2 == 0)                                          /* when j is even */
                    {
                        System.out.print(ch+" ");
                        ch++;
                    }
                    else                                                /* when j is odd  */
                    {
                        System.out.print(num+" ");
                        num++;
                    }
            }
            System.out.println();
            temp--;
        }
    }
}


