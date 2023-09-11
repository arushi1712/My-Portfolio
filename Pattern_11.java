package Type3;

public class Pattern_11 {
    public static void main(String[] args) {
        int i=0,j=0,temp=5, num=1;
        for(i=1;i<=5;i++)
        {
            if(i%2==0)                                                 /* when i is even */
            {
                for(j=1;j<=temp;j++)
                {
                    System.out.print("  ");
                    num++;
                }
            }
            else                                                      /* when i is odd*/
            {
                for(j=1;j<=temp; j++)
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
