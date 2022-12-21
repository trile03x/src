import java.util.*;
public class BAI14 {
    static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    static void check(int Trr[][])
    {
        int [] check1={0,0,0,0,0,0,0};
        int [] check2={1,1,1,1,1,1,1};
        for(int i=0;i<Trr.length;i++)
        {
            if(Arrays.equals(Trr[i], check1))
            {
                System.out.println("All 0 on row "+i);
            }
            else if(Arrays.equals(Trr[i], check2))
            {
                System.out.println("All 1 on row "+i);
            }
        }
        for( int j = 0;j< Trr[0].length;j++)
        {
            int count1 =0;
            int count2 =0;
            for ( int i=0;i< Trr.length;i++)
            {
                if(Trr[i][j]==0)
                {
                    count1++;
                }
                else if (Trr[i][j]==1)
                {
                    count2++;
                }
                if(count1==Trr.length)
                {
                    System.out.println("All 0 on columns "+j);
                }
                if(count2==Trr.length)
                {
                    System.out.println("All 1 on columns "+j);
                }
            }
        }
        int i,j;
        i = j =0;
        int count1 =0;
        int count2 =0;
        while(i<Trr.length)
        {
            if(Trr[i][j]==0)
            {
                count1++;
            }
            else if(Trr[i][j]==1)
            {
                count2++;
            }
          i++;
          j++;
        }
        if(count1==Trr.length)
        {
            System.out.println("All 0 on main diagonal ");
        }
        if(count2==Trr.length)
        {
           System.out.println("All 1 on main diagonal ");
        }
        int r = 0;
        int c = Trr[0].length-1;
        int dem1 =0;
        int dem2 =0;
        while(r<c)
        {
            if(Trr[r][c]==0)
            {
             dem1++;
            }
            else if(Trr[r][c]==1)
            {
                dem2++;
            }
            r++;
            c--;
        }
        if(dem1==Trr.length)
        {
            System.out.println("All 0 on auxiliary diagonal "+j);
        }
        if(dem2==Trr.length)
        {
           System.out.println("All 1 on auxiliary diagonal "+j);
        }
    }
    public static void main(String[] agrs)
    {    
         Scanner sc = new Scanner(System.in);
         int [][] Trr = new int [7][7];
         for(int i =0;i<7;i++)
         {
             for(int j=0;j<Trr[i].length;j++)
             {
                 Trr[i][j]=sc.nextInt();
             }
         }
         display(Trr);
         check(Trr);
    }
}
