package Type3;

public class Pattern_17 {
    public static void main(String[] args) {
        int i=0,j=0, num=1;
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
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
            num=1;
        }
    }
}
