import java.util.*;
public class BAI12 {
    static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    static int [][] SumMaxtric(int arr[][], int brr[][])
    {
        int [][] result = new int[7][7];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                result[i][j]=arr[i][j]+brr[i][j];
            }
        }
        return result;
    }
    public static void main( String[] args)
    {
        int [][] number1 = new int[7][7];
        int [][] number2 = new int[7][7];
        int [][] number3 = new int[7][7];
        Random rand = new Random();
        for(int i=0;i<number1.length;i++)
        {
            for(int j=0;j<number1[i].length;j++)
            {
                number1[i][j]= rand.nextInt(99)+0;
                number2[i][j]= rand.nextInt(99)+0;
            }
        }
        System.out.println("1st Matrix");
        display(number1);
        System.out.println("\n2nd Matrix");
        display(number2);
        number3=SumMaxtric(number1,number2);
        System.out.println("\n3rd Matrix");
        display(number3);
        
    }
}
