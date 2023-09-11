package Type3;

public class Pattern_3 {
    public static void main(String[] args) {
        int i,j,k,space;
        for(i=1;i<=5;i++)
        {
            space=5-i;
            for(j=space;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
