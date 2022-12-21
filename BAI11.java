import java.util.*;
public class BAI11 {
    static int [][] SumEmployee(int arr[][])
    {
        int ii=0;
        int [][] result = new int [8][2];
        for(int i=0;i<arr.length;i++)
        {
            int sum =0;
            for(int j=0;j<arr[0].length;j++)
            {
                sum += arr[i][j];
            }
               result[ii][0]=i;
               result[ii][1]=sum;
               ii++;
        }
        int  temp;
        int tempvt;
        for( int i=0;i<result.length;i++)
        {
            for( int j=i+1;j<result.length;j++)
            {
               if(result[i][1]<=result[j][1])
               {
                   temp = result[i][1];
                   result[i][1] = result[j][1];
                   result[j][1] = temp;
                   tempvt = result[i][0];
                   result[i][0] = result[j][0];
                   result[j][0] = tempvt;
               }
            }
        }
        return result;
    }
    public static void main(String [] args)
    {
        int [] [] arr = {{2,4,3,4,5,8,8},
            {7,3,4,3,3,4,4},
            {3,3,4,3,3,2,2},
            {9,3,4,7,3,4,1},
            {3,5,4,3,6,3,8},
            {3,4,4,6,3,4,4},
            {3,7,4,8,3,8,4},
            {6,3,5,9,2,7,9}};
        System.out.println("- Xuất bảng ghi số giờ làm việc: ");
        System.out.println("\t    Su  M  T  W  H  F  Sa");
        for( int i=0;i<arr.length;i++)
        {
            System.out.println("Employee "+(i+1)+" "+Arrays.toString(arr[i]));
        }
        int [] [] arr2 = new int[8][2];
        arr2 = SumEmployee(arr);
        System.out.println("- Tổng số giờ làm của nhân viên theo thứ tự giảm dần ");
        for(int i =0;i<arr2.length;i++)
        {
                System.out.println("Tổng giờ làm việc của người thứ "+(arr2[i][0]+1)+" = "+(arr2[i][1]));
            
        }
    }
}
