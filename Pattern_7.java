package Type3;

public class Pattern_7 {
    public static void main(String[] args) {
        int i=0,j=0,num=5;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=num;j++)
            {
                System.out.print(i+" ");
            }
            --num;
            System.out.println();
        }
    }
}
