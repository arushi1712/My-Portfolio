package Type2;

public class Pattern6 {
    public static void main(String[] args)
    {
        int i,j,num;
        for(i=1;i<=5;i++)
        {
            if(i%2==0)                                                 // when i is even
            {
                for(j=1;j<=i;j++)
                {
                    if(j%2==0)                                         // when j is even
                    {
                        num=1;
                        System.out.print(num+" ");
                    }
                    else                                                  // when j is odd
                    {
                        num=0;
                        System.out.print(num+" ");
                    }
                }
                System.out.println();
            }
            else                                                       // when i is odd
            {
                for(j=1;j<=i;j++)
                {
                    if(j%2==0)                                         // when j is even
                    {
                        num=0;
                        System.out.print(num+" ");
                    }
                    else                                              // when j is odd
                    {
                        num=1;
                        System.out.print(num+" ");
                    }
                }
                System.out.println();
            }

        }
    }

}
