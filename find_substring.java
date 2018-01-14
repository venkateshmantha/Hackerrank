import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] strings = new String[n];
        scan.nextLine();
        for(int i=0;i<n;i++){
            strings[i] = scan.nextLine();
        }
        int q =scan.nextInt();
        scan.nextLine();
        String[] queries = new String[q];
        for(int i=0;i<q;i++){
            queries[i] = scan.nextLine();
        }
        
        for(String query:queries){
            String reg_str = "\\w"+query+"\\w"; 
            Pattern p = Pattern.compile(reg_str);
            int count = 0;
            for(String str:strings){
                Matcher m = p.matcher(str);
                while(m.find()){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
