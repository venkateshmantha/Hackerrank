import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int whoGetsTheCatch(int n, int x, int[] X, int[] V){
        int res =0;
        int[] times = new int[n];
        int min_time = Integer.MAX_VALUE;
        int pos =0;
        for(int i=0;i<n;i++){
            int d = Math.abs(X[i]-x);
            int v = V[i];
            int time = d/v;
            times[i] = time;
            if(time<min_time){
                min_time = time;
                pos = i;
            }
        }
        res = pos;
        for(int i=0;i<n;i++){
            if(i==pos)
                continue;
            else{
                if(times[i]==min_time)
                    res = -1;
            }
        }
        return res;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Return the index of the catcher who gets the catch, or -1 if no one gets the catch.
        int n = in.nextInt();
        int x = in.nextInt();
        int[] X = new int[n];
        for(int X_i=0; X_i < n; X_i++){
            X[X_i] = in.nextInt();
        }
        int[] V = new int[n];
        for(int V_i=0; V_i < n; V_i++){
            V[V_i] = in.nextInt();
        }
        int result = whoGetsTheCatch(n, x, X, V);
        System.out.println(result);
    }
}
