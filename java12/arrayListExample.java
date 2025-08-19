package java12;
import java.util.ArrayList;
public class arrayListExample {
    public static void main(String[] args){
        ArrayList<Integer> List = new ArrayList<>(10);
        List.add(10);
        List.add(20);
        List.add(30);
        System.out.println("ArrayList: " + List);

        List.remove(1);
        System.out.println("After removal: " + List);

        List.clear();
        System.out.println("After clear: " + List);

        List.add(40);
        List.add(50);
        System.out.println("After re-adding elements: " + List);

        List.trimToSize();
        System.out.println("After trimToSize: " + List);

        List.ensureCapacity(20);
        System.out.println("After ensureCapacity: " + List);

        List.trimToSize();
        System.out.println("After trimToSize: " + List);

        for (int i = 0; i < List.size(); i++) {
            System.out.println("Element at index " + i + ": " + List.get(i));
        }

        System.out.println("Final ArrayList: " + List);
    }
    
}
