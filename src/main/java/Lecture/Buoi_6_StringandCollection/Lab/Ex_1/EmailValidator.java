/*
Tạo một lớp có tên EmailValidator với một phương thức có tên là validEmail(String email) để kiểm tra xem
        một địa chỉ email là hợp lệ. Triển khai logic xác thực bằng cách sử dụng biểu thức chính quy và Chuỗi
        hoạt động. Kiểm tra lớp EmailValidator bằng cách tạo một cá thể, gọi phương thức validEmail
        bằng các địa chỉ email khác nhau và kiểm tra kết quả xác thực.
*/


package Lecture.Buoi_6_StringandCollection.Lab.Ex_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    //Tạo method để xác thực email
    public boolean validEmail(String email) {
        // Xác định biểu thức chính quy để xác thực email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);

        //Kiểm tra email có rỗng hay không
        if (email == null) {
            return false;
        }

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
