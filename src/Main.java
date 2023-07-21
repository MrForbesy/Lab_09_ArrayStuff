import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        int [] dataPoints = new int[100];
        Random rnd = new Random();

        for (int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }
        for (int x = 0; x < dataPoints.length; x++)
        {
            System.out.print(dataPoints[x]);
            if (x < dataPoints.length - 1)
            {
                System.out.printf(" | ");
            }
        }
        int sum = 0;
        for (int x = 0; x < dataPoints.length; x++)
        {
            sum += dataPoints[x];
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("\nThe sum of the data points is: " + sum);
        System.out.printf("The average of the data points is: %.2f%n", average);
    }
}