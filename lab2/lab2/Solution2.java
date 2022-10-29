import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public double average(int[] array) {
        int l = array.length;
        int sum = 0;
        for(int i=0; i<l; i++){
            sum += array[i];
        }
        double average = (double)sum / l;
        return average;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine().replaceAll("\\[|\\]", "");
        String[] s = sin.split(", ");;
        int[] arr = new int[s.length];
        if (s.length == 1 && s[0].isEmpty())
            arr = new int[]{};
        else {
            for(int i = 0; i < s.length; ++i)
               arr[i] = Integer.parseInt(s[i]);
        }
         if(arr.length == 0){
             System.out.print(0.0);
         }else{
             double out = new Solution().average(arr);
             System.out.print(out);          
         } 
    }
}
