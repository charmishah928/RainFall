
package rainfall;
/**
 * @author Charmi
//11/3/15
/**
 * RainFall
 * -----------------
 * monthName: String[]
 * rainFall: double[]
 * --------------------
 * getTotal(): double
 * getAverage(): double
 * getMax(): double
 * getMin(): double
 * monthRainFall(): void
 *
 */
public class RainFall
{
    
    private String[] monthName = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private double[] rainFall = {0.40, 0.94, 3.21, 3.74, 1.73, 1.03, 1.27, 2.58, 6.98, 6.90, 2.80, 2.53};
    
    public  double getTotal()
    {
        
        double total = 0;
        for(int i = 0; i < 12; i++)
        {
            RainFall temp = new RainFall();
            total += temp.rainFall[i];

        }
        return total;
    }
    
    public  double getAverage()
    {
        double average;
        average = getTotal()/12.0;
        return average;
    }
    
    public  double[] getMax()
    {
        RainFall temp = new RainFall();
        double[] max = {temp.rainFall[0], 0};
        for(int i = 1; i < 12; i++)
        {
            if(temp.rainFall[i] > max[0])
            {
                max[0] = temp.rainFall[i];
                max[1] = i;
            }
       }
       return max;
    }
    
    public double getMin()
    {
        RainFall temp = new RainFall();
        double min = temp.rainFall[0];
        for(int i = 1; i < 12; i++)
        {
            if(temp.rainFall[i] < min)
            {
                min = temp.rainFall[i];
            }
        }
        return min;
    }
    
    public void monthRainFall()
    {
        for(int i = 0; i < 12; i++)
        {
            System.out.println(monthName[i] + "\t\t" + rainFall[i]);
        }
    }
    
    public static void main(String[] args)
    {
        RainFall one = new RainFall();
        System.out.println("Total rainfall is: " + one.getTotal());
        System.out.printf("The average is: " + "%.2f",one.getAverage());
        System.out.println();
        double[] max = one.getMax();
        System.out.println("The max is: " + max[0] + " for the month " + one.monthName[(int)max[1]] );
        System.out.println("The min is: " + one.getMin());
        one.monthRainFall();
    }
}