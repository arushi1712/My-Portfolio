package Type3;

public class Pattern_4 {
    public static void main(String[] args) {
        int i=0,j=0,k=0,space=0; char ch;
        for(i=1;i<=5;i++)
        {
            ch='A';
            space=5-i;
            for(j=space;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
