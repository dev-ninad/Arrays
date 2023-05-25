package array;
import java.util.*;
public class symmetric 
{


    public static void mains(String [] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]mat = new int[n][n];

        for(int i=0;  i<n; i++)
                {
                        for(int j=0; j<n; j++)
                                {
                                    mat[i][j] = sc.nextInt();
                                }
                }

        int [][]t = new int[n][n];
        boolean flag = false;
        for(int i=0;i<n; i++)
                {
                        for(int j=0; j<n; j++)
                                {       
                                        if(t[i][j]!= mat[j][i])
                                        {
                                            flag = true;
                                        }
                                }
                            if(flag==true)
                            {
                                System.out.println("Not Symmetrical");
                            }
                            else
                            {
                                System.out.println("Symmetrical");
                            }
                }
                sc.close();
    }
    
}

