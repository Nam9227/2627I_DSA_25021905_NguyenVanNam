package Tuan_9;
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

public class bai_3 {
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

    public static void inOrder(nut root) {
        if (root == null) return;
        inOrder(root.trai);
        System.out.print(root.data + " ");
        inOrder(root.phai);
    }

    public static void main(String[] args) {
        nut root = null;

        // Dựng cây ban đầu: 4, 2, 7, 1, 3
        int[] banDau = {4, 2, 7, 1, 3};
        for (int x : banDau) {
            root = chen(root, x);
        }

        System.out.print("Cây ban đầu (In-order): ");
        inOrder(root);
        System.out.println();

        // Chèn thêm nút 6 theo đúng ví dụ bài tập
        root = chen(root, 6);

        System.out.print("Cây sau khi chèn 6 (In-order): ");
        inOrder(root);
        System.out.println();
    }
}
