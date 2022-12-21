import java.util.*;
public class BAI09 {
    static int SumDiagonal(int arr[][])
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(i==j)
                {
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String [] args)
    {
        int [] [] arr = {{1, 2, 4, 5}, {6, 7, 8, 9}, {10, 11, 12, 13}, {14, 15, 16, 17}};
        System.out.println("- Xuất ma trận: ");
        for( int i=0;i<arr.length;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("- Tổng đường chéo chính của ma trận = "+SumDiagonal(arr));
    }
}
