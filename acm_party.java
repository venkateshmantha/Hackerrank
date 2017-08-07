import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        while(t-- > 0){
            String input = scan.nextLine();
            int[] freq = new int[26];
            int total = 0;
            for(int i=0;i<input.length();i++){
                char c = input.charAt(i);
                freq[c-'a']++;
                total++;
            }
            for(int f=0;f<26;f++){
                if(freq[f] == total-freq[f]){
                    System.out.println("YES");
                    break;
                }
                if(f==25)
                    System.out.println("NO");
            }
        }
    }
}