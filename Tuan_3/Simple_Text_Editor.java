package Tuan_3;

import java.util.Scanner;
import java.util.Stack;
class tam{
    int kieu;
    String xau;
    int ddai;
    public tam(int kieu,String xau,int ddai){
        this.kieu = kieu;
        this.xau = xau;
        this.ddai = ddai;
    }
}
public class Simple_Text_Editor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Character> chinh = new Stack<>();
        Stack<tam> lenh = new Stack<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                String s = sc.next();
                them(chinh, lenh, s);
            }
            if (x == 2) {
                int k = sc.nextInt();
                xoa(chinh, lenh, k);
            }
            if (x == 3) {
                int tt = sc.nextInt();
                inra(chinh, tt);
            }
            if (x == 4) {
                hoan(chinh, lenh);
            }
        }
    }

private static void inra(Stack<Character> chinh, int tt) {
    System.out.println(chinh.get(tt-1));
}

private static void hoan(Stack<Character> chinh, Stack<tam> lenh) {
        tam t = lenh.pop();
        Stack<tam> linhtinh = new Stack<>();
        if (t.kieu == 1) {
            xoa(chinh,linhtinh, t.ddai);
        }
        if (t.kieu == 2) {
            them(chinh,linhtinh,t.xau);
        }
    }

    private static void xoa(Stack<Character> chinh, Stack<tam> lenh, int k) {
        String s = "";
        for(int i = 0; i < k; i++) {
            if (!chinh.isEmpty()) {
                s = chinh.pop() + s;
            }
        }
        lenh.push(new tam(2, s, s.length()));
    }

    private static void them(Stack<Character> chinh, Stack<tam> lenh, String s) {
        for(char c : s.toCharArray()) {
            chinh.push(c);
        }
        lenh.push(new tam(1,s,s.length()));
    }

}
