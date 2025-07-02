import java.util.LinkedList;
import java.util.ArrayList;
public class Day4 {
    public static void main(String[] args) {
//Creating an arrayList with Integer wrapper class         
//         ArrayList<Integer> values = new ArrayList<>();
//         values.add(10);
//         values.add(45);
//         values.add(23);
//         values.add(67);
//         values.add(69);
// //inserting an element at a specific index using add(index,val)
//         values.add(0,42);
//         System.out.println(values); // 42 10 45 23 67 69
// //accessing the value at specific index using get method 
//         System.out.println(values.get(0));
// // updating the value at specific index using set method
//         values.set(0,106);
//         System.out.println(values);
// //sorting the list in ascending using sort method 
//         values.sort(null);
//         System.out.println(values);
//         values.remove(4);
//         System.out.println(values);
// the below line works only for String type ArrayList
//        values.remove("String");

        


    LinkedList<Integer> listuu = new LinkedList<>();
    listuu.add(4512);
    listuu.add(123);
    listuu.add(456);
    listuu.add(789);
    System.out.println(listuu);
   // insert a value at the beginning of list 
    listuu.addFirst(31231);
    System.out.println(listuu);
    // insert a value at the end of list
    listuu.addLast(106);
    System.out.println(listuu);
    listuu.add(69);
    System.out.println(listuu);
    listuu.remove(3);
    System.out.println(listuu);
    


    }
}
