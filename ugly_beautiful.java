import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String uglyOrBeautiful(int[] a) {
        
        boolean isPositive = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= a.length && a[i] != a[i + 1]) {
                if (a[i] > a[i + 1]) {
                    isPositive = true;
                }  
            }
        }
                    
        if (isPositive) {
            return "Beautiful";
        } else {
            return "Ugly";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = uglyOrBeautiful(a);
            System.out.println(result);
        }
        in.close();
    }
}

