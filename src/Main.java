import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         CustomList<Number> customArraylist=new CustomList<>();
        customArraylist.add(1);
        customArraylist.add(2);
        customArraylist.add(3);
        customArraylist.add(4);
        customArraylist.add(5);
        System.out.println("Size: "+customArraylist.size());
        System.out.println("First element: "+customArraylist.getFirstElement());
        System.out.println("Last element: "+customArraylist.getLastElement());
        System.out.println(customArraylist.get(1));
        customArraylist.remove(1);
        customArraylist.printList();
        customArraylist.findThisIndex(3);
        customArraylist.clear();
        customArraylist.printList();

    }
}