package Tuan_3;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {
    public static boolean kt(String s){
        Stack<Character> a = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                a.push(c);
            }
            if (c==')'){
                if (a.isEmpty() || a.peek()!='(')
                    return false;
                a.pop();
            }
            if (c==']'){
                if (a.isEmpty() || a.peek()!='[')
                    return false;
                a.pop();
            }
            if (c=='}'){
                if (a.isEmpty() || a.peek()!='{')
                    return false;
                a.pop();
            }
        }
        if (a.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            if(kt(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
//())