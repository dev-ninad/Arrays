 
import java.util.*;
public class arrayshortest {

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++)
                {
                        a[i]=sc.nextInt();
                }
        int count =0;
        if(a[i] %2 == 0)
        {
                count++;
        }
        if(count<=1)
        {
                System.out.println("Absent");
        }
    }

}
    

