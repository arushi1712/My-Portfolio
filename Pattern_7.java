package Type1;

public class Pattern_7
{
    public static void main(String[] args)
    {
        int i, j;
        char ch;
        for (i = 1; i <= 5; i++)
        {
            for (j = 1; j <= 5; j++)
                {
                    if(j%2==0)                  //when j is even
                    {
                        ch='+';
                        System.out.print(ch + " ");
                    }
                    else                     // when j is odd
                    {
                        ch='*';
                        System.out.print(ch + " ");
                    }
                }
            System.out.println();
            }

        }
    }



