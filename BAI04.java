import java.util.*;
public class BAI04 {
    static double avg(double arr[])
    {
        double sum =0;
        for(int i=0;i<10;i++)
        {
            sum=sum+arr[i];
        }
        return sum/10;
    }
    static int check(double arr[])
    {
        int count =0;
        for(int i =0;i<10;i++)
        {
            if(arr[i]>avg(arr))
            {
                count++;
            } 
        }
        return count;
    }
    public static void main ( String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        for(int i=0;i<10;i++)
        {
            arr[i]= sc.nextDouble();
        }

        System.out.println("The avergare of arrays " + Arrays.toString(arr)+"= "+avg(arr));
        System.out.println( check(arr)+" numbers are above the average ");
        
    } 
}