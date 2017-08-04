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
        TreeMap<Integer,Queue<String>> map = new TreeMap(Collections.reverseOrder());
        for(int i=1;i<=t;i++){
            String[] query = scan.nextLine().split(" ");
            if(query.length==3){
                String content = query[1];
                int prt = Integer.parseInt(query[2]);
                if(!map.containsKey(prt)){
                    Queue<String> queue = new LinkedList();
                    queue.add(content);
                    map.put(prt,queue);
                }
                else{
                    Queue que = map.get(prt);
                    que.add(content);
                }
            }
            else{
                if(map.firstEntry()!=null){
                    int key = map.firstKey();
                    Queue q = map.get(key);
                    System.out.println(q.poll());
                    if(q.isEmpty())
                    	map.remove(key);
                }
                else
                    System.out.println("-1");
            }
        }
    }
}