import java.util.*;
public class BAI13 {
    static int [][] Mul2Matrix( int arr[][], int brr [][],int n, int x)
    {
        int [][] result = new int [n][x];
        for ( int i=0;i<arr.length;i++)
        {
            for(int j =0;j<brr[0].length;j++)
            {
                result[i][j]=0;
                for(int k = 0;k<arr[0].length;k++)
                {
                    result[i][j] =result[i][j] + arr[i][k]*brr[k][j];
                }      
            }
        }
        return result;
    }
    static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void main( String[] args)
    {
        Random rand = new Random();
        int n =rand.nextInt(3)+3;
        int m =rand.nextInt(4)+3;
        int x =rand.nextInt(4)+3;
        int [][] arr1 = new int [n][m];
        int [][] arr2 = new int [m][x];
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                arr1[i][j]= rand.nextInt(9)+0;
            }
        }
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                arr2[i][j]= rand.nextInt(9)+0;
            }
        }
        System.out.println("1st Matrix : ");
        display(arr1);
        System.out.println("2nd Matrix : ");
        display(arr2);
        int [][] KQ = Mul2Matrix(arr1,arr2,n,x);
        System.out.println("Answer :");
        for( int i=0;i<KQ.length;i++)
        {
            System.out.println(Arrays.toString(KQ[i]));
        }
    }
}
