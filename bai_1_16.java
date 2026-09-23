import java.util.Scanner;
public class bai_1_16 {
    public static Double[] tron(Double[]a,int d,int c,int g){
        /*for (int i = d; i <= g; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print(" ; ");
        for (int i = g+1; i <= c; i++) {
            System.out.print(a[i]+" ");
        }*/
        Double[] b=new Double[c+1];
        int cs=0;
        int i=d,j=g+1;
        while(i<=g && j<=c)
        {
            if(a[i]<=a[j]) {
                b[cs] = a[i];
                cs++;
                i++;
            }
            else {
                b[cs] = a[j];
                cs++;
                j++;
            }
        }
        while(i<=g) {
           b[cs]=a[i];
           cs++;
           i++;
        }
        while(j<=c) {
            b[cs] = a[j];
            cs++;
            j++;
        }
        cs=0;
        for(i=d;i<=c;i++){
            a[i]=b[cs];
            cs++;
        }
        return a;
    }

    public static Double[] sx(Double[] a, int d, int c){
        if (d >= c) {
            return a;
        }
        int g= (d+c)/2;
        sx(a, d, g);
        sx(a, g+1, c);
        tron(a,d,c,g);
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] a = new Double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        //sapxep b = new sapxep(a);
        sx(a, 0, n-1);
        Double kc=a[1]-a[0];
        Double d=a[0],c=a[1];
        for (int i = 0; i < n-1; i++) {
            if (a[i+1]-a[i] <= kc){
                kc=a[i+1]-a[i];
                d=a[i];
                c=a[i+1];
            }
        }
        System.out.println(d+" "+c);
    }
}
