import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isValid(String email) {
        if(email.length()!=18)
            return "No";
        else{
            if(!email.substring(5,18).equals("@hogwarts.com"))
                return "No";
            for(int i=0;i<5;i++){
                if(email.charAt(i)-'a' < 0 || email.charAt(i)-'a' > 26)
                    return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
        in.close();
    }
}
