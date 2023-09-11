package Type3;

public class Pattern_12 {
    public static void main(String[] args) {
        int i=0,j=0,temp=5,num=1;
        char ch='a';
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=temp;j++)
            {
                if (i % 2 == 0)                                                      /* when i is even  */
                {
                    System.out.print(ch + " ");
                    ch++;
                }
                else                                                            /* when i is odd  */
                {
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
            temp--;
        }
    }
}
