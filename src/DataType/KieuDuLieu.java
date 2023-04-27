package DataType;

import java.lang.reflect.Array;

public class KieuDuLieu {
    public static void main(){
        //String hầu như không giới hạn độ dài. tuy nhiên có thể báo lỗi khi lưu mã hóa base64
        String kieudulieu = "Các toán hạng của các toán tử số học phải ở dạng số. Các toán hạng kiểu boolean không sử dụng được, các toán hạng ký tự cho phép sử dụng loại toán tử này. Một vài kiểu toán tử được liệt kê trong bảng dưới đây.\n" +
                "\n" +
                "Giả sử chúng ta có biến số nguyên a = 10 và b = 20.";
        //Giới hạn từ -128 đền 127

        char b = 'a';

        boolean  c = true;

        byte a = -128; // giới hạn 1byte (8 bit)

        short d = -32768; // giới hạn 2byte ( 16 bit)

        int e = -2147483648; // giới hạn lưu được 4 byte (32 bit)

        long f = 1234567890123456789L; // giới hạn lưu được 8 byte (64 bit). Có thể nhập thêm chữ L để phân biệt.

        float n = 123456789.123456789F; //4byte. Thêm chữ F ở cuối. Lưu kiểu số thực, số thập phân.

        double m = 123454656757.235436546546D; // 8 byte.   Giá trị mặc định là 0.00D

        String[] ten = {"a1", "a2", "a3"};
    }
}
