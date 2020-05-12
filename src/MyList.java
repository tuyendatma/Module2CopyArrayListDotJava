import org.omg.CORBA.Object;

import java.util.AbstractList;

public class MyList<E>  {
    //de kieu genedic la E thi minh co the su dung de lam viec voi tat ca cac class ma minh tao them
    private int size=0;
    static final int DEFAULT_CAPACITY =10;
    private Object element[];

    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        element = new Object[capacity];
    }
    public void add(int index, E e) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) element[i + 1] = element[i];
        element[index] = (Object) e;
        size++;
    }
    private void ensureCapacity() {
        if (size >= element.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(element, 0, newData, 0, size);
            element = (Object[]) newData;
        }
    }
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    public E remove(int index) {
        checkIndex(index);
        E e = (E) element[index];
        for (int j = index; j < size - 1; j++)
            element[j] = element[j + 1];
        element[size - 1] = null;
        size--;
        return e;
    }
}
