
import java.util.*;
public class secondl
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }

        int max1=Integer.MIN_VALUE;

        int max2=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(a[i]>=max1)
            {
                max2=max1;
                max1=a[i];
            }
             else if(a[i]>=max2 && a[i]!= max1)
            {
                max2=a[i];
            }
            
        }
        System.out.println(max2);
        sc.close();
    }

}