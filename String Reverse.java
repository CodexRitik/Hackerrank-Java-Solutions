import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder str = new StringBuilder(A);
        str = str.reverse();
        String res = (str.toString().equals(A))?"Yes":"No";
        System.out.println(res);
        
    }
}
