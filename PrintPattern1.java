import java.util.Scanner;

public class PrintPattern1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int input = scan.nextInt();

        for (int i = 1; i<=input; i++)
        {
            for (int u = 1; u<=i; u++)
            {
                System.out.print(u);
            }
            System.out.println();
        }

    }
}