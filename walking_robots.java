import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int howManyCollisions(String s){
        int len = s.length();
        int start =0;
        int end = len-1;
        int col=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='l')
                start++;
            else break;
        }
        for(int i=len-1;i>0;i--){
            if(s.charAt(i)=='r')
                end--;
            else
                break;
        }
        if(start>=end)
            return 0;
        else{
            for(int i=start;i<=end;i++){
                if(s.charAt(i)=='d')
                    continue;
                else
                    col++;
            }
        }
        return col;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // Returns the number of times moving robots collide.
            int result = howManyCollisions(s);
            System.out.println(result);
        }
    }
}
