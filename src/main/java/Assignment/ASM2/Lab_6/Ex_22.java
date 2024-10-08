package Assignment.ASM2.Lab_6;

import java.util.Collections;
import java.util.LinkedList;

public class Ex_22 {
    public void sortLinkedList(LinkedList<Integer> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(50);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        Ex_22 sorter = new Ex_22();
        sorter.sortLinkedList(list);
        System.out.println(list);
    }
}
