package Type1;

public class Pattern_6 {
    public static void main(String[] args)
    {
        int num, i, j;
        for (i = 1; i <= 4; i++)
        {
            if (i % 2 == 1)                     /*when i is odd*/
            {
                for (j = 1; j <= 5; j++)
                {
                    if(j%2==0)                  //when j is even
                    {
                        num=0;
                        System.out.print(num + " ");
                    }
                    else                     // when j is odd
                    {
                        num=1;
                        System.out.print(num + " ");
                    }
                }
            }
            else                               /* This else is when i is even*/
            {
                for (j = 1; j <= 5; j++)
                {
                    if(j%2==0)                 // when j is even
                    {
                        num=1;
                        System.out.print(num + " ");
                    }
                    else                        // when j is odd
                    {
                        num=0;
                        System.out.print(num + " ");
                    }

                }
            }
            System.out.println();
        }
    }
}