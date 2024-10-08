/*Tạo một lớp có tên Máy tính với phương thức có tên là Divide(int num1, int num2) thực hiện
phép chia hai số. Thực hiện xử lý ngoại lệ để xử lý tình huống khi lần thứ hai
số bằng 0 và đưa ra một ngoại lệ tùy chỉnh có tên là DivideByZeroException. Kiểm tra máy tính
class bằng cách gọi phương thức chia với các đầu vào khác nhau và xử lý các ngoại lệ một cách khéo léo.*/

package Lab.ExceptionHandling.Ex_1;

class DivideByZeroException extends Exception {
    public DivideByZeroException(String s) {
        super();
    }
}

class Calculator {
    public double divide(int num1, int num2) throws DivideByZeroException {
        if (num2 == 0) {
            throw new DivideByZeroException("Division by zero is not allowed.");
        }
        return (double) num1 / num2;
    }
}


