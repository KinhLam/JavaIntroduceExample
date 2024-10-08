package Assignment.ASM2.Lab_6;

import java.util.HashSet;
import java.util.LinkedList;

public class Ex_25 {
    public <T> boolean hasCycle(LinkedList<T> list) {
        HashSet<T> set = new HashSet<>(list);
        for(T element: list){
            if(set.contains(element)){
                return true;
            }
            set.add(element);
        }
        return false;
    }

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Ex_25 ex = new Ex_25();
        System.out.println(ex.hasCycle(list));
    }
}
