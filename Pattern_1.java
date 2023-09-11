package Type3;

public class Pattern_1 {
    public static void main(String[] args) {
        int i,j,k,space;
        for(i=1;i<=5;i++)
        {
            space=5-i;
            for(j=space;j>=1;j--)
            {
                System.out.print("  ");
                space--;
            }
            for(k=1;k<=i;k++)
            {
                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }
}

