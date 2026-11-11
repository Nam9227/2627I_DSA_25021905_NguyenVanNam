package Tuan_4;

import java.util.Scanner;

public class Insertion_Sort_Part_1 {
    public static void lm(int[] a ){
        int b=a[a.length-1];
        int j = a.length-2;
        while(j>=0 && a[j]>b)
        {
            a[j+1] = a[j];
            j--;
            inra(a);
        }
        a[j+1] = b;
        inra(a);
    }
    public static void inra(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        lm(a);
    }
}
