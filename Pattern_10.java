package Type3;

public class Pattern_10
{
    public static void main(String[] args) {
        int i=0,j=0, num=5; char ch='a';
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=num;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
            num--;
        }
    }
}
