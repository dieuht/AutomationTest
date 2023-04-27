package JavaBasic.Variable;

public class BienToanCuc_InstanceVariable {
    //Biến toàn cục
    String name = "dieuht1";
    int old = 33;
    String Company = "Viettel";

    public void getInfo1(){
        System.out.println("Thông tin Tên: " + name);
        System.out.println("Tuổi: " + old );
        System.out.println("Công ty: " + Company);
    }

    public void getInfo2(){
        System.out.println("Thông tin Tên: " + name);
        System.out.println("Tuổi: " + old );
        System.out.println("Công ty: " + Company);
    }

    public static void main(String[] args) {
        BienToanCuc_InstanceVariable BienToanCuc_InstanceVariable;

        
    }
}
