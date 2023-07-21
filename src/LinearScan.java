import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearScan
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int[] dataPoints = new int[100];
        Random rnd = new Random();

        for (int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(100) +1;
        }

        for (int x =0; x <dataPoints.length; x++)
            {
                System.out.print(dataPoints[x]);
                if (x < dataPoints.length - 1)
                {
                    System.out.print(" | ");
                }
            }
            System.out.println();

            int userNum = SafeInput.getRangedInt(in,"Please enter an integer between ",1, 100);

            int count = 0;
            for (int x = 0; x < dataPoints.length; x++)
            {
                if (dataPoints[x] == userNum)
                {
                    count++;
                }
            }
            System.out.println("Your number was found " + count + " times in the array");

            int userNum2 = SafeInput.getRangedInt(in,"Please enter another integer between: ", 1, 100);

            int position = -1;
            for (int x = 0; x < dataPoints.length; x++)
            {
                if (dataPoints[x] == userNum2);
                {
                    position = x;
                    break;
                }
            }
            if (position != -1)
            {
                System.out.println("The number " + userNum2 + " was found in the array index " + position + ".");
            }
            else
            {
                System.out.println("The value " + userNum2 + " was not found in the array.");
            }

            int min = dataPoints[0];
            int max = dataPoints[0];
            for (int x = 1; x < dataPoints.length; x++)
            {
                if (dataPoints[x] < min)
                {
                    min = dataPoints[x];
                }
                if (dataPoints[x] > max)
                {
                    max = dataPoints[x];
                }
            }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        System.out.println("Average of the dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values)
    {
        int sum = 0;
        for (int value : values)
        {
            sum += value;
        }
        return (double) sum / values.length;
    }
}



