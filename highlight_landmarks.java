import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] tokens = input.split(" ");
        int n = scan.nextInt();
        HashSet<String> set = new HashSet();
        for(int i=1;i<=n;i++)
            set.add(scan.next());
        for(int i=0;i<tokens.length;i++){
            if(set.contains(tokens[i]))
                tokens[i] = "<b>"+tokens[i]+"</b>";
        }
        for(String s:tokens)
            System.out.print(s +" ");
    }
}
