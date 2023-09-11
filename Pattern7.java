package Type2;
class Pattern7
{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if (i%2==0)                                                           // when i is even
                {
                    System.out.print('#'+" ");
                }
                else                                                                   // when i is odd
                {
                    System.out.print('*'+" ");
                }
            }
            System.out.println();
        }
    }
}