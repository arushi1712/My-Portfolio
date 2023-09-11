package Type3;

public class Pattern_20
{
    public static void main(String[] args)
    {
        int i=0, j=0, num=0;char ch='a';
        for(i=1;i<=5;i++)
        {
            if(i%2==0)                                                                                                                                   /* when i is even  */
                {
                for (j = 1; j <= 5; j++)
                {
                    if (j < i)
                    {
                        System.out.print("  ");
                    }
                    else
                    {
                        System.out.print(ch + " ");
                    }
                }
                ch++;
            }
            else                                                                                                                                         /* when i is odd */
            {
                ++num;
                for(j=1;j<=5;j++)
                {
                    if(j<i)
                     {
                         System.out.print("  ");
                    }
                    else
                    {
                         System.out.print(num+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
