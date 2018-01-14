import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        TreeSet<String> set = new TreeSet();
        while(n-->=0){
            String line = scan.nextLine();
            //String reg = "<\\s*/[a-z]+\\s*>";
            String reg = "<\\s*\\w+";
            Pattern tag = Pattern.compile(reg);
            Matcher match = tag.matcher(line);
            while(match.find()){
                String tag_str = match.group();
                tag_str = tag_str.substring(1);
                tag_str.trim();
                set.add(tag_str);
            }
            
        }
        String res = "";
        for(String s:set){
            res += s;
            res += ";";
        }
        System.out.println(res.substring(0,res.length()-1));
    }
}
