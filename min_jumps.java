import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int len = scan.nextInt();
		    int[] arr = new int[len];
		    for(int i=0;i<len;i++){
		        arr[i] = scan.nextInt();
		    }
		    System.out.println(getMinSteps(len,arr));
		}
	}
	
	private static int getMinSteps(int len, int[] arr){
		if(len == 0)
			return -1;
		if(len==1)
			return 1;
		if(arr[0]==0)
			return -1;
		int steps = 0;
		int curr_index = 0;
		while(curr_index<len) {
			int steps_to_search = arr[curr_index];
			if(arr[curr_index]>=len-1-curr_index){
			    steps++;
			    break;
			}
			int next_index = getNextStep(len,arr,curr_index,steps_to_search);
			if(next_index == -1)
			    return -1;
			curr_index = next_index;
			steps++;
			
		}
		return steps;
	    
	}

	private static int getNextStep(int len, int[] arr, int curr_index, int steps_to_search) {
		int max_reach = 0;
		int next_step = 0;
		for(int i=1;i<=steps_to_search;i++) {
			if(curr_index+i<len && arr[curr_index+i]>max_reach) {
				max_reach = arr[curr_index+i];
				next_step = curr_index+i;
				if(max_reach>=len-curr_index)
				    break;
			}
		}
		if(max_reach==0)
		    return -1;
		else
		    return next_step;
	}
}

