package Practice.Practice_2;

public class PaymentGateway {
    public boolean processPaymen(double amount) {
        System.out.println("Đang xử lý thanh toán:  " + amount);
        return true;
    }

    public void generateReceipt(double amount) {
        System.out.println("Đã tạo hóa đơn cho " + amount);
    }
}
