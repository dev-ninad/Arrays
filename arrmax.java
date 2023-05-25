
import java.util.*;
public class arrmax
{
    public static void main(String[] args) throws Exception
    {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int []arr = new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]= sc.nextInt();
            }
            int max=arr[0];
            int index = 0;
            int sum =0;

            for(int i =1;i<n;i++)
                {
                    if(arr[i]>max)
                    {
                        max= arr[i];
                        index = i;
                    }
                    
                }
            System.out.println("Maximum element is " + max);
            System.out.println("Index of max element is "+ index);



    }
}