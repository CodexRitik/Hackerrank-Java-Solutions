import java.io.*;
import java.util.*;

public class Solution {

    static void print(String a,String b){
        if(a.compareTo(b)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B= scan.next();
        int len = A.length()+B.length();
        String s1 = A.substring(0,1);
        String s2 = B.substring(0,1);
        String S1 = A.substring(1);
        String S2 = B.substring(1);
        String Str = "";
        Str+=s1.toUpperCase()+S1+" "+s2.toUpperCase()+S2;
        System.out.println(len);
        print(A,B);
        System.out.println(Str);
    }    
}



