package JavaBasic.Variable;

public class BienCucBo_LovalVariable {
    public void sayHello() {
        int n = 10;                     // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
        //Biến cục bộ được khai báo ở phương thức/hàm nên không gọi được ở phương thức/hàm khác
        //Chỉ dành cho tính toán hoặc trong 1 phạm vi nhất định
        //Vd: ở hàm sayHello không gọi được đến biếm name
        //và hàm main không gọi được biến n
    }

    public static void main(String[] args) {
        String name = "abc"; //Đây cũng là biến cục bộ
        BienCucBo_LovalVariable bienLocal = new BienCucBo_LovalVariable();
        bienLocal.sayHello();
    }
}
