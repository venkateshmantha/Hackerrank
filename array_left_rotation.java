public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        reverseArray(a,0,k-1);
        reverseArray(a,k,n-1);
        reverseArray(a,0,n-1);
        return a;
    }
    
    public static void reverseArray(int[] a, int start, int end){
        while(start<end){
            int tmp = a[end];
            a[end] = a[start];
            a[start] = tmp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
