import java.util.*;
public class BAI02 {
    static int SNT(int n)
    {
        if(n==2)
        {
            return 1;
        }
        else
        {
            for(int i=2;i<n;i++)
            {
                if(n%i!=0)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        }
        return 0;
    }
    static int CheckDivisible(int a[])
    {
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%10==0)
            {
                sum += a[i];
            }
        }
        return sum;
    }
    static int SumMin(int a[])
    {
        int sum =a[0]+a[1];
        for(int i=0;i<a.length;i++)
        {
            if(i<a.length-2)
            {
              int g =a[i]+a[i+1];
              if(sum>=g)
              {
                sum = g;
              }
            }
            else
            {
                break;
            }
        }
       
        return sum;
    }
    static double AvgOdd(int a[])
    {
        double sum=0;
        double count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {sum+=a[i];
                count++;}
        }
        return sum/count;
    }
    static int CheckSNT(int a[])
    {
        int count1 =0;
        for(int i=0;i<a.length;i++)
        {
            int check = SNT(a[i]);
            if(check==1)
            {
                count1++;
            }
        }
        return count1;
    }
    static int  ArrDX(int b[])
    {
        int count2=0;
        
        for(int i=0;i<b .length/2;i++)
        {
               if(b[i]!=b[b.length-i-1])
               {
                   count2++;
               } 
        }
       return count2;
    }
    static int CheckRank(int b[], int a[])
    {
        if(Arrays.equals(a,b))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    static int[] DeleteArr(int b[])
    {
        int j=0;
        int [] temp = new int[b.length];
        for(int i=0;i<b.length;i++)
        {
            if(b[i]>=0)
            {
               temp[j]=b[i];
               j++;
            }
        }
        int ic=0;
        
        for(int i=0;i<j;i++)
        {
            if(temp[i]!=0)
            {
                ic++;
            }
        }
        int [] c = new int [ic];
        int ind = 0;
        for(int i=0;i<j;i++)
        {
            if(temp[i]!=0)
            {
                c[ind]=temp[i];
                ind++;
            }   
        }
        return c;
    }
    static void daonguoc(int arr[])
    {
        int [] dn = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--)
        {
            dn[arr.length-i-1]=arr[i];
        }
        System.out.println(Arrays.toString(dn));
    }
    static int[] Style(int arr[])
    {
        int [] result = new int[arr.length];
        int ind =-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%3==0&&arr[i]%2==0)
            {
                ind++;
                result[ind]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%3!=0)
            {
               ind++;
               result[ind]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%3==0&&arr[i]%2!=0)
            {
                ind++;
                result[ind]=arr[i];
            }
        }
        return result;
    }
    static void MangTangMax(int arr[])
    {
        int [] b = new int [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            b[i]=1;
        }
        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i]>=arr[i-1])
            {
                b[i-1]=b[i]+1;
            }
        }
        int sl = TimMax(b);
        for(int i=0;i<arr.length;i++)
        {
            if(b[i]==sl)
            {
                System.out.print("- Longest Increasing Array: [" );
                for(int j=i;j<sl+i;j++)
                {
                    System.out.print(arr[j]+" ");
                }
                System.out.println("]");
            }
        }
    }
    static int TimMax(int arr[])
    {
        int max = arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("* Input "+n+" integer numbers :");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int [] brr = new int[n];
        for(int i=0;i<n;i++)
        {
            brr[i]= arr[i];
        }
        int [] arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]= arr[i];
        }
        System.out.println("- "+Arrays.toString(arr));
        System.out.println("- Sum of arr elements which is divisible by 2 and 5 = "+CheckDivisible(arr));
        System.out.println("- The last minimum sum of two consecutive elements = "+SumMin(arr));
        System.out.println("- The average of odd array elements = "+AvgOdd(arr));
        System.out.println("- "+CheckSNT(arr)+" numbers of prime");
        if(ArrDX(arr)==0)
        {
            System.out.println("- Symmetric Array");
        }
        else
        {
            System.out.println("- No symmetric Array");
        }
        Arrays.sort(brr);
        if(CheckRank(arr,brr)==1)
        {
            System.out.println("- Increasing Array");
        }
        else
        {
            System.out.println("- Not increasing Array");
        }
        arr=DeleteArr(arr);
        System.out.println("- Delete negative element :"+Arrays.toString(arr));
        System.out.println("* Input 1 number for "+Arrays.toString(arr));
        int m =sc.nextInt();  
        int [] arr2 = new int[arr.length+1];
        arr2=Arrays.copyOf(arr, arr.length);
        arr2[arr2.length-1]=m;
        Arrays.sort(arr2);
        System.out.println("- Increasing arrays when add "+m+" :"+ Arrays.toString(arr2));
        System.out.print("- Reverse the array elements ");daonguoc(arr2);
        MangTangMax(arr1);
        Arrays.sort(brr);
        System.out.println("- Sort the array to make it increasing :"+Arrays.toString(arr2)); 
        System.out.println("- Final Answer : "+Arrays.toString(Style(arr2)));

    }
}
