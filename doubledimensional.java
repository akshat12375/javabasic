import java.util.*;

public class doubledimensional {
    public static void main(String[] args) {
        int ar[][]=new int [5][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        for(int a=0;a<5;a++)
        {
            for(int b=0;b<3;b++)
            {
                ar[a][b]=sc.nextInt();
            }
        }
    for(int c=0;c<5;c++)
    {
        for(int d=0;d<3;d++)
        {
            System.out.print(+ar[c][d]+"  ");
        }
   System.out.println();
    }

    }
}
