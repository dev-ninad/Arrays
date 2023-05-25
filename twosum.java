import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    
    public static int[] twoSum(int[] A, int target) {
       // Your code here
		int left = 0 , right = A.length - 1 , tempSum;
        while(left < right)
        {
            tempSum = A[left] + A[right];
            if(tempSum == target)
                return new int[]{left + 1 , right + 1};
            if(tempSum > target)
                right--;
            else
                left++;
        }
        return new int[]{-1 , -1};
    }

	
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int)n];
        for(int i=0; i<n; i++)arr[i]=Integer.parseInt(inputLine[i]);
        int m = Integer.parseInt(br.readLine().trim());
        int[] ans = (twoSum(arr, m));
        System.out.println(ans[0] + " " + ans[1]);
	}
}



