import java.util.Scanner;

class nut {
    int data;
    nut phai;
    nut trai;
    public nut(int data) {
        this.data = data;
        this.phai = null;
        this.trai = null;
    }
    public void setPhai(nut phai) {
        this.phai = phai;
    }
    public void setTrai(nut trai) {
        this.trai = trai;
    }
}

public class bai_4 {
    public static nut chen(nut root, int data){
        if (root == null){
            return new nut(data);
        }
        if (data < root.data){
            root.setTrai(chen(root.trai, data));
        }
        else if (data > root.data){
            root.setPhai(chen(root.phai, data));
        }
        return root;
    }

    public static nut tim(nut ht,int v1,int v2){
        if (ht==null){
            return null;
        }
        if (ht.data < v1 && ht.data <v2){
            return tim(ht.phai,v1,v2);
        }
        if(ht.data > v1 && ht.data > v2){
            return tim(ht.trai,v1,v2);
        }
        return ht;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Đọc dòng 1: Số lượng nút n
        int n = scanner.nextInt();

        // 2. Đọc dòng 2: Lần lượt n số và chèn vào cây
        nut root = null;
        for (int i = 0; i < n; i++) {
            int giaTri = scanner.nextInt();
            root = chen(root, giaTri);
        }

        // 3. Đọc dòng 3: Hai giá trị v1 và v2 cần tìm LCA
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();

        scanner.close();

        // Tìm kiếm và in kết quả
        nut ketQua = tim(root, v1, v2);
        if (ketQua != null) {
            System.out.println(ketQua.data);
        }
    }

}
