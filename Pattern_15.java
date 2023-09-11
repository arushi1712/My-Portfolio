package Type3;

public class Pattern_15 {
    public static void main(String[] args) {
        int i=0,j=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j<i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print('*' + " ");
                }
            }
            System.out.println();
        }
    }
}
