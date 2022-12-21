import java.util.*;
public class BAI07 {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int [] arr = new int [10];
        for (int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        int index =0;
        int [] arr2 = new int [10];
        boolean check;
        for(int i=0;i<10;i++)
        {
            check = false;
            for(int j=i+1;j<10;j++)
            {
                if(arr[i]==arr[j])
                {
                    check = true;
                    break;
                }
            }
            if(!check)
            {
                arr2[index++]= arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
