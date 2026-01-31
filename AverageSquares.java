import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {
        
        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        /*
        // Prompt for input
        System.out.print("Enter your name: ");

        // Read in line from standard input
        String name = in.nextLine();

        System.out.println("Hi " + name + "!");
        */

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("You entered: " + startNum + " and " + endNum);

        double sum = 0;
        int index = startNum;
        do 
        {
            sum+=index*index;
            index++;
        } while (index<=endNum);
        System.out.println(sum/(endNum-startNum+1));
    }
}