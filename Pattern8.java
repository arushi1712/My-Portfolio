package Type2;

public class Pattern8 {
    public static void main(String[] args) {
        int i,j,num=10;                                       // initial value of num is 10
        System.out.println(num);
        for(i=1;i<5;i++)
        {
            for(j=0;j<=i;j++)
            {
                num=num + 10;                                // for first iteration, num=20
                System.out.print(num+" ");
                if(num==90)
                {
                    num=0;                            // this will set num=0, so that in next iteration, num=10 again
                }
            }
            System.out.println();
        }
    }
}
