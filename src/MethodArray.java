import java.util.Random;
import java.util.Scanner;

public class MethodArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int[] dataPoints = new int[100];
        Random random = new Random();

        for (int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = random.nextInt(100) + 1;
        }

        for (int x = 0; x < dataPoints.length; x++)
        {
            System.out.print(dataPoints[x]);
            if (x < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int userNum = SafeInput.getRangedInt(in, "Enter an integer value between: ", 1, 100);

        int count = occurance(dataPoints, userNum);
        System.out.println("The user's number was found " + count + " times in the array.");

        int userNum2 = SafeInput.getRangedInt(in, "Please enter another integer between: ", 1, 100);

        boolean containsNum = contains(dataPoints, userNum2);
        if (containsNum)
        {
            int place = findPlace(dataPoints, userNum2);
            System.out.println("The number " + userNum2 + " was found at the array index " + place + ".");
        }
        else
        {
            System.out.println("The number " + userNum2 + " was not found in the array");
        }

        int min = min(dataPoints);
        int max = max(dataPoints);

        System.out.println("The minimum number of the array is " + min);
        System.out.println("The maximum number of hte array is " + max);

        int sum = sum(dataPoints);

        System.out.println("The sum of the array is " + sum);

        double average = getAverage(dataPoints);

        System.out.println("The average of the numbers in the array is " + average);
    }
    public static int min(int[] numbers)
    {
        int min = numbers[0];
        for (int x = 1; x < numbers.length; x++)
        {
            if (numbers[x] < min)
            {
                min = numbers[x];
            }
        }
        return min;
    }

    public static int max(int [] numbers)
    {
        int max = numbers[0];
        for (int x = 1; x < numbers.length; x++)
        {
            if (numbers[x] > max)
            {
                max = numbers[x];
            }
        }
        return max;
    }

    public static int occurance(int[] numbers, int target)
    {
        int count = 0;
        for (int number : numbers)
        {
            if (number == target)
            {
                count++;
            }
        }
        return count;
    }

    public static int sum(int[] numbers)
    {
        int sum = 0;
        for (int number : numbers)
        {
            sum += number;
        }
        return sum;
    }

    public static boolean contains(int[] numbers, int target)
    {
        for (int number : numbers)
        {
            if (number == target)
            {
                return true;
            }
        }
        return false;
    }

    public static int findPlace(int[] numbers, int target)
    {
        for (int x = 0; x < numbers.length; x++)
        {
            if (numbers[x] == target)
            {
                return x;
            }
        }
        return -1;
    }

    public static double getAverage(int[] numbers)
    {
        int sum = sum(numbers);
        return (double) sum / numbers.length;
    }
}
