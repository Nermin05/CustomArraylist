import java.util.Arrays;
import java.util.Objects;

public class CustomList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object[] elements;
    public CustomList() {
        elements=new Object[DEFAULT_CAPACITY];
    }
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E)elements[index];
    }

    public int size() {
        return size;
    }



    private void increaseCapacity() {
        int newCapacity=elements.length*2;
     elements= Arrays.copyOf(elements,newCapacity);
    }
    public E getLastElement() {
        return (E) elements[size-1];
    }
    public E getFirstElement() {
        return (E)elements[0];
    }
    public void add(E element) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = element;
    }
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        int copyNum=size-index-1;
if(copyNum>0) {
    System.arraycopy(elements,index+1,elements,index,copyNum);
}
elements[--size]=null;
return (E) elements[index];
    }
    public void clear() {
        for(int i=0;i<elements.length;i++) {
            elements[i]=null;
        }
        size=0;
        System.out.println("ArrayList is alredy clean");
    }
    public void findThisIndex(E element) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
             if (element != null && element.equals(elements[i])) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("There is no such element");
        }
    }



    public void printList() {
        for(int i=0;i<size;i++) {
            System.out.print(elements[i]+" ");
        }
        System.out.println();
    }
    public void isEmpty() {
        if (size==0) {
            throw new IllegalArgumentException("There is no element");
        }
    }
}
