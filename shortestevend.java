package array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class shortestevend
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int ans = Integer.MAX_VALUE;
                int []a = new int[n];
                for(int i=0;i<n; i++)
                {
                    a[i] =sc.nextInt();
                    
                }
                for(int i=0; i<n; i++)
                        {
                                for(int j = i+1; j<n; j++)
                                        {
                                                if(a[i]%2 ==0 && a[j]%2 ==0)
                                                {
                                                        if(j-i<ans)
                                                        {
                                                                ans= j-i;
                                                        }
                                                }
                                        }
                        }
                
                if(ans == Integer.MAX_VALUE)
                        {
                        System.out.println("Absent");
                        }
                else
                {
                        System.out.println(ans);
                }
	}
}