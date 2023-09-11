package Type3;

public class Pattern_13 {
    public static void main(String[] args)
    {
        int i, j, temp=5, num=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=temp;j++)
            {
                System.out.print(num+" ");
                num+=2;
            }
            num=1; temp--;
            System.out.println();
        }
    }
}
