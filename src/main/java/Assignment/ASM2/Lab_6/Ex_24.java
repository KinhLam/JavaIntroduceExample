package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

public class Ex_24 {
    public <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if(n > list.size()){
            throw new IllegalArgumentException("n is larger than list size");
        }
        int indexFromStart = list.size() - n;
        return list.get(indexFromStart);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Ex_24 ex = new Ex_24();
        System.out.println(ex.findNthFromEnd(list, 3));
    }
}
