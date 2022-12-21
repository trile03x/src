import java.util.*;
public class BAI08 {
    public static void main(String[] args)
    {
        Random sc = new Random();
        int [] arr = new int [100];
        for ( int i=0;i<100;i++)
        {
            arr[i]=sc.nextInt(9)+0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
