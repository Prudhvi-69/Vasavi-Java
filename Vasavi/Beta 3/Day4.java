import java.util.Collections;
import java.util.LinkedList;
public class Day4
{
    public static void main(String[] args)
    {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(1);
        li.add(44);
        li.add(74);
        li.add(69);
        li.add(23);
        System.out.println("Values in List : "+li);
        li.addFirst(106);
        System.out.println("Values after First : "+li);
        li.addLast(420);
        System.out.println("Values after Last : "+li);
        //specific index value 
        System.out.println("Value at 4 :"+li.get(4));
        System.out.println("Value at First :"+li.getFirst());
        System.out.println("Value at Last :"+li.getLast());
        li.remove(3);
        System.out.println("Values after Remove 3 : "+li);
        li.add(69);
        System.out.println("Values after Duplicate: "+li);
        li.removeFirst();
        System.out.println("Values after Removing First : "+li);
        li.removeLast();
        System.out.println("Values after Removing Last : "+li);




//         ArrayList<Integer> values = new ArrayList<>();
//         // Creating an ArrayLst of Integer type with the name values
//         values.add(10); // inserting an element to the ArrayList
//         values.add(40);  // at the ending
//         values.add(50);
//         values.add(9);
//         values.add(4);
//         values.add(69);
//         values.add(100);
//         values.add(42);
//         values.add(3,106); // adding at a specific index



//         System.out.println("OG values : "+values); // displaying values in the Array

//         Collections.sort(values); // Sorting values directly
//         System.out.println("Sorted values : "+values); // displaying values in the Array
//     // getting the value at specific index
//         System.out.println("Value at index 4 : "+values.get(4));
//     // removing the elements based on index 
//         values.remove(4);
//         System.out.println("After deleting : "+values);   
//     //delete the element based on value
// //        System.out.println("Clearing all : "+values); 
//     // to update any value at any index 
//         values.set(6,555);
//         System.out.println("After updating : "+values); 

    











    }
}