package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

public class Ex_21 {
    public <T> T findKthElement(LinkedList<T> list, int k) {
        int indexFromStart = list.size() - k;
        return list.get(indexFromStart);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Ex_21 finder = new Ex_21();
        System.out.println(finder.findKthElement(list, 2));
    }
}
