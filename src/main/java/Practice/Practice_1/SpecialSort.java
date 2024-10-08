package Practice.Practice_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SpecialSort {
    public static void main(String[] args) {
        SpecialSort sorter = new SpecialSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập số lượng phần tử mong muốn: ");
        int number = sc.nextInt();

        //Tạo mảng để lưu các con số
        ArrayList<Integer> list = new ArrayList<>();

        //Hiển thị nội dung nhập
        for(int i = 0; i < number; i++){
            System.out.print("Phần tử thứ " + i + ": ");
            list.add(sc.nextInt());
        }

        //Gọi hàm để xử lý và hiển thị kết quả
        System.out.print("Mảng sau khi được sắp xếp: " + sorter.sortArray(list));
    }

    //Hàm xử lý dữ liệu
    public String sortArray(ArrayList<Integer> list){
        //Khởi tạo Array để lưu 2 giá trị số lẻ và chẵn
        ArrayList<Integer> soLe = new ArrayList<>();
        ArrayList<Integer> soChan = new ArrayList<>();

        //Xử lý để phân loại mảng
        for(Integer numbers : list){
            if(numbers % 2 == 0){
                soChan.add(numbers);
            }else{
                soLe.add(numbers);
            }
        }

        //Sắp xếp số lẻ theo hướng tăng dần
        Collections.sort(soLe);

        //Sắp xếp số lẻ theo hướng giảm dần
        Collections.sort(soChan, Collections.reverseOrder());

        //Gộp 2 danh sách số lẻ và số chẵn
        soLe.addAll(soChan);

        return soLe.toString();
    }
}
