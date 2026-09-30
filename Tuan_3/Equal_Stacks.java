package Tuan_3;


import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Equal_Stacks {
    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<>();
        Queue<Integer> b = new LinkedList<>();
        Queue<Integer> c = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int t1,t2,t3;
        t1=t2=t3=0;
        for (int i =1;i<=n1;i++)
        {
            int t = sc.nextInt();
            a.add(t);
            t1+=t;
        }
        for (int i =1;i<=n2;i++)
        {
            int t = sc.nextInt();
            b.add(t);
            t2+=t;
        }
        for (int i =1;i<=n3;i++)
        {
            int t = sc.nextInt();
            c.add(t);
            t3+=t;
        }
        //System.out.println(t1+" "+t2+" "+t3);
        while(t1 != t2 || t2!= t3){
            if(t1>t2)
                t1-=a.poll();
            else if(t2>t3)
                t2-=b.poll();
            else
                t3-=c.poll();
        }
        System.out.println(t1);
    }
}
