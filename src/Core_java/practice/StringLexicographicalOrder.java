package Core_java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class StringLexicographicalOrder {
        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";
            List<String> a = new ArrayList<>();
            for(int i=0;i<s.length()-k+1;i++){
                a.add(s.substring(i,i+k));
            }
            sort(a);
            smallest = a.get(0);
            largest = a.get(a.size()-1);
            return smallest + "\n" + largest;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();
            System.out.println(getSmallestAndLargest(s, k));
        }
}

