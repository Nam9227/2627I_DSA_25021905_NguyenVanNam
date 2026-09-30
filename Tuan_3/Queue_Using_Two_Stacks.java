package Tuan_3;

import edu.princeton.cs.algs4.Stack;

import java.util.Scanner;

public class Queue_Using_Two_Stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        Stack<Integer> vo = new Stack<>();
        Stack<Integer> ra = new Stack<>();
        for(int i =1;i<=n;i++){
            int a,b;
            a=sc.nextInt();
            if (a==1){
                b=sc.nextInt();
                vo.push(b);
            }else{
                if (ra.isEmpty()){
                    while(!vo.isEmpty()){
                        ra.push(vo.pop());
                    }
                }
                if(a==2)
                    ra.pop();
                if(a==3)
                    System.out.println(ra.peek());
            }
            sc.nextLine();
        }
    }
}
