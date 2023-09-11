package Type3;

public class Pattern_19 {
    public static void main(String[] args) {
        int i=0,j=0;char ch='a';
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j<i)
                {
                    System.out.print("  ");
                }
                else {
                    System.out.print(ch+" ");
                }
            }
            ch++;
            System.out.println();
        }
    }
}
