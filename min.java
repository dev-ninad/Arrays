package array;
import java.util.*;

public class min 
{
    public static void main (String[] args) throws java.lang.Exception
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] a = new int[n];
    
    for(int i =0;i<n; i++)
    {
        a[i] = sc.nextInt();
    }
    int min = Integer.MAX_VALUE;

    for(int i=0; i<n; i++)
    {
        if(a[i]<min)
        {
            min=a[i];
        }
    }
    System.out.println(min);
}
}
