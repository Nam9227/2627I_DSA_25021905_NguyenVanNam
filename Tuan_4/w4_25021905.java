import java.util.Scanner;

public class w4_25021905 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+2];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (k>n) k=n+1;
            a[k]++;
        }
        int kk=a[n+1];
        for(int i=n ;i>=0;i--){
            kk+=a[i];
            if(kk>=i)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
