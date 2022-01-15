import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i =0 ; i<n ; i++){ 
            String num = sc.next();
            if((int)num.length() % 2==0){
                sum = sum + 1;
                           }
        }
        System.out.print(sum);
    }
}
