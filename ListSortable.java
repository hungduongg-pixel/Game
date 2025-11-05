import java.util.*;
class ListSortable<E extends Comparable> {
    private List<E> list = new ArrayList<>();

    public void add(E element) {
        list.add(element);
    }

    public void sort() {
        Collections.sort(list);
    }

    public void print() {
        for (E e : list) {
            System.out.println(e);
        }
    }
}


