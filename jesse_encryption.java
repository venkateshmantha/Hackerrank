import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder output = new StringBuilder();
        HashMap<Character,String> map = new HashMap();
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(c==' ' || c=='.')
                output.append(c);
            else{
                String enc = "";
                if(!map.containsKey(c)){
                    if(c-'a'>9)
                        enc = Integer.toString(c-'a') +"#";
                    else enc = Integer.toString(c-'a');
                    map.put(c,enc);
                    output.append(enc);
                }
                else
                    output.append(map.get(c));   
            }
        }
        System.out.println(output.toString());
    }
}