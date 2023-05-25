package array;
import java.util.*;
public class mineven
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int num = sc.nextInt();
                
                int []a = new int[n];
                for(int i = 0; i<n ; i++)
                        {
                            a[i] = sc.nextInt();
                        }
                int count = 0;
                for(int i=0; i<n; i++)
                        {
                                if(a[i] == num)
                                {
                                        
                                        System.out.print(i+1 + " ");
                                        count++;
                                 }
                              
                         }
                 if(count==0)
                               {
                                       System.out.println(-1);
                               }
                    else
                    {
                         
                    }
                    sc.close();


    }
}

