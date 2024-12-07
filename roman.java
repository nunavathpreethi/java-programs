import java.util.*;
import java.util.HashMap;
public class Main{
    public static int romantointeger(String s){
        HashMap<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int sum = mp.get(s.charAt(s.length() - 1)); // Start with the last character value
        for (int i = s.length() - 2; i >= 0; i--) {
            if (mp.get(s.charAt(i)) < mp.get(s.charAt(i + 1))) {
                sum -= mp.get(s.charAt(i)); // Subtract if current value is less than next value
            } else {
                sum += mp.get(s.charAt(i)); // Otherwise, add
            }
        }
        return sum;
    }
    public static void main(String arg[]){
        String s="XVII";
        System.out.print(romantointeger(s));
    }
}