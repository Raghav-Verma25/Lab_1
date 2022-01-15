import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i =0 ; i<n ; i++){ 
            int num = sc.nextInt();
            sum = sum + num;
            System.out.print(sum+" ");
        }
    }
}
