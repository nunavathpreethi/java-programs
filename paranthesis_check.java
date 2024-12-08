import java.util.*;
public class Main{
    public static boolean isValid(String st){
        Stack<Character> s=new Stack<Character>();
        for(char c:st.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                s.push(c);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                char ch=s.pop();
                if(c==')'&&ch=='('||c=='}'&&ch=='{'||c==']'&&ch=='['){
                    continue;
                }
                else
                return false;
            }
        }
        return s.isEmpty();
    }
    public static void main(String args[]){
        String st="({}[])";
        if(isValid(st)){
            System.out.println("given expression is valid expression");
        }
        else
        System.out.println("given expression is invalid expression");
    }
}
 