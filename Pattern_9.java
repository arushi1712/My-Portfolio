package Type3;

public class Pattern_9
{
    public static void main(String[] args) {
        int i=0,j=0,num=5; char ch='a', temp=ch;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=num;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            ch=temp; num--;
            System.out.println();
        }
    }
}
