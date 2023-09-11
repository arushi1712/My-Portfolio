package Type2;

public class Pattern9 {
    public static void main(String[] args) {
        int i,j,num=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(num==2)
                {
                    System.out.print(num+" ");
                    num=0;
                    continue;
                }
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
