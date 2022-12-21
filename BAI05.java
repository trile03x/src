import java.util.*;
public class BAI05 {
    static void display(double arr[])
    {
        for(int i =arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main( String[] args)
    {
      Scanner sc  = new Scanner(System.in);
      double [] arr = new double [10];
      for(int i=0;i<10;i++)
      {
          arr[i]= sc.nextDouble();
      }
      display(arr);
    }
}
