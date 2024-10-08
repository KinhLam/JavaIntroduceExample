package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

public class Ex_23 {
    public LinkedList<Integer> mergeSortedLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> mergedList = new LinkedList<>();
        int i = 0, j = 0;

        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                mergedList.add(l1.get(i));
                i++;
            }else{
                mergedList.add(l2.get(j));
                j++;
            }
        }
        while (i < l1.size()) {
            mergedList.add(l1.get(i));
            i++;
        }
        while (j < l2.size()) {
            mergedList.add(l2.get(j));
            j++;
        }
        return mergedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(30);
        list1.add(50);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(20);
        list2.add(40);
        list2.add(60);

        Ex_23 ex = new Ex_23();
        LinkedList<Integer> mergedList = ex.mergeSortedLists(list1, list2);
        System.out.println(mergedList);
    }
}
