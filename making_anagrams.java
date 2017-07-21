import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int res=0;
        int[] count_array =  new int[26];
        for(int i=0;i<first.length();i++){
            count_array[first.charAt(i)-'a']++;
        }
        for(int i=0;i<second.length();i++){
            count_array[second.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count_array[i]!=0)
                res+=Math.abs(count_array[i]);
        }
        return res;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
