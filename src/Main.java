import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x;
        int i,j;
        x=in.nextInt();
        for(i=1;i<=x;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("x");
            }
            System.out.println();
        }

    }
}
