import java.util.*;
public class BAI06{
     static void check(double a[])
     {
         int count1=0;
         int count2=0;
         for(int i=0;i<a.length;i++)
         {
             if(a[i]<=50)
             {
                 count1++;
             }
             else
                count2++;
         }
         System.out.println("Có "+ count1+" điểm bé hơn hoặc bằng điểm trung bình");
         System.out.println("Có "+ count2+" lớn điểm trung bình");
     }
     public static void main( String[] args)
     {
         Scanner sc = new Scanner(System.in);
         ArrayList<Double>arr = new ArrayList<Double>();
         double n;
         do{
              n = sc.nextDouble();
              if(n<0||n>100)
              {
                  break;
              }
              else
              {
              arr.add(n);
              }
             
         }while(true);
         double [] a = new double[arr.size()];
         for(int i= 0;i<arr.size();i++)
         {
             a[i] =arr.get(i);
         }
         System.out.println(Arrays.toString(a));
         check(a);
     }
}
