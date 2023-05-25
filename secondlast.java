package array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class secondlast
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                int temp = num;
                temp = (num/10)%10;
                

                if(temp==0)
                {
                        System.out.println("Yes");
                }
                else
                {
                        System.out.println("No");
                }
                sc.close();
	}
}