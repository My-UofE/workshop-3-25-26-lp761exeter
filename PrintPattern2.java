import java.util.Scanner;

public class PrintPattern2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int input = scan.nextInt();
        String result = "";
        boolean valid = false;

        // input testing
        while (valid!=true)
        {
            if (input<1)
            {
                System.out.println("too small!");
            }
            else if (input>5)
            {
                System.out.println("too big!");
            }
            else
            {
                valid = true;
                break;
            }
            System.out.println("Enter the size: ");
            input = scan.nextInt();
        }

        // square building 
        for (int i = 0; i<input; i++)
        {
            // build first half of row
            String halfRow = "";
            int index = i+1;
            for (int u = 0; u<input; u++)
            {
                halfRow+=index;
                index++;
            }

            // build row by adding the second reversed half
            String row = halfRow + reverse(halfRow);

            // add to first half total message
            result+=row+"\n";
        }

        // build total message by adding the second reversed half
        result+=reverse(result.substring(0,result.length()-1));
        System.out.println(result);
    }
    
    public static String reverse(String str)
    {
        String result = "";
        for (int i = str.length()-1; i>=0; i--)
        {
            result+=str.charAt(i);
        }
        return result;
    }
}

    

