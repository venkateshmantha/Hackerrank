import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String onceInATram(int x) {
        
        x++;
        while(true){
            int tmp =x;
            int firstsum =0;
            int secondsum =0;
            for(int i=1;i<=3;i++){
                int mod = tmp%10;
                tmp /= 10;
                firstsum += mod;
            }
            for(int i=1;i<=3;i++){
                int mod = tmp%10;
                tmp /= 10;
                secondsum += mod;
            }
            if(firstsum==secondsum)
                break;
            else
                x++;
        }
        return Integer.toString(x);
    }
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}
