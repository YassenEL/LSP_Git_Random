package ord.howard.edu.lsp.assignment4;
import java.util.ArrayList;


public class Driver {

    public static void main(String[] args) {
        // Create an Empty Set and see what prints
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        IntegerSet set3 = new IntegerSet();
        System.out.println("Set 1: " + set1); // []
        System.out.println("Set 1's Length: " + set1.length());
        set1.remove(0);
        System.out.println("Set 1: " + set1);
        // Add Elements to Set 1 and 2
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set 1 after adding elements: " + set1); 
        
        set2.add(0);
        set2.add(2);
        set2.add(4);
        set2.add(1);
        System.out.println("Set 2 after adding elements: " + set2);
        
        
        // Printing the length of both sets
        System.out.println("Set 1's length is: " + set1.length());
        System.out.println("Set 2's length is: " + set2.length());
        
        
        
        //Testing the equals and contains function
        
        boolean result = set1.equals(set2);
        System.out.println("Are the sets equal? " + result);
        set1.clear();
        set2.clear();
        
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        set2.add(1);
        set2.add(2);
        set2.add(3);
        
        result = set1.equals(set2);
        System.out.println("Are the sets equal? "+ result);
        
        result = set1.contains(1);
        System.out.println("Does the set contain this number? "+ result);
        result = set1.contains(4);
        System.out.println("Does the set contain this number? "+ result);
        result = set1.contains(-1);
        System.out.println("Does the set contain this number? "+ result);
        set1.clear();
        set2.clear();
        
        
        // Testing the Remove function
        set1.add(5);
        set1.add(10);
        set1.add(15);
        

        set2.add(4);
        set2.add(8);
        set2.add(12);
        
        set1.remove(0);
        set1.remove(-1);
        set1.remove(5);
        set2.remove(8);
        System.out.println("Set 1: "+ set1);
        System.out.println("Set 2: "+ set2);
        
        
        // Checking the difference function
        set1.diff(set2);
        System.out.println("Sets after subtracting their elements: " + set1);
        
        set1.clear();
        set2.clear();
        
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set 1: "+ set1);
        
        set2.add(0);
        set2.add(2);
        set2.add(4);
        set2.add(1);
        System.out.println("Set 2: "+ set2);
        set1.diff(set2);
        System.out.println("Sets after subtracting their elements: " + set1);
        
        set1.clear();
        set2.clear();
        
        // Testing the Union, Intersection, and Complement Functions here
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(-1);
        set2.add(-5);
        set2.add(0);
        set2.add(0);
        
        set3.add(1);
        set3.add(-1);
        set3.add(1);
        set3.add(-1);
        set3.add(1);
        set3.add(-1);
        set3.add(1);
        set3.add(-1);
        set3.add(1);
        set3.add(-1);
        set3.add(1);
        
        
        
        
        
        set1.intersect(set2);
        System.out.println("The Intersection of Set 1 and 2 is: " + set1);
        
        set2.intersect(set3);
        System.out.println("The Intersection of Set 2 and 3 is: " + set2);
        
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(-1);
        set2.add(-5);
        set2.add(0);
        set2.add(0);
        
        set3.add(1);
        set3.add(-1);
        set3.add(1);
        set3.add(-1);
        set3.add(1);
        set3.add(-1);
        set3.add(1);
        set3.add(-1);
        set3.add(1);
        set3.add(-1);
        set3.add(1);
        
        
        
        set1.union(set2);
        System.out.println("The Union of Set 1 and 2 is: " + set1);
        set2.union(set3);
        System.out.println("The Union of Set 2 and 3 is: " + set2);
        
        set1.clear();
        set2.clear();
        set3.clear();
        
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);
        set1.add(9);
        set1.add(11);
        set1.add(13);
        
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        set2.add(10);
        set2.add(12);
        set2.add(14);
        
        set3.add(3);
        set3.add(6);
        set3.add(9);
        set3.add(12);
        set3.add(15);
        set3.add(18);
        set3.add(21);
        set3.add(24);
        
        set1.complement(set2);
        
        System.out.println("Complement of Set 1 and 2: " + set1);
        
        set2.complement(set3);
        System.out.println("Complement of Set 2 and 3: " + set2);
        set1.clear();
        set2.clear();
        set3.clear();
        //Testing the isEmpty, then the toString Functions
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);
        set1.add(9);
        set1.add(11);
        set1.add(13);
        
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        set2.add(10);
        set2.add(12);
        set2.add(14);
        
        result = set1.isEmpty();
        System.out.println("Is this set Empty? "+ result);
        result = set2.isEmpty();
        System.out.println("Is this set Empty? "+ result);
        result = set3.isEmpty();
        System.out.println("Is this set Empty? "+ result);
        
        set1.toString();
        set2.toString();
        set3.toString();
        System.out.println("This set as a string is: " + set1);
        System.out.println("This set as a string is: " + set2);
        System.out.println("This set as a string is: " + set3);
        // Testing the smallest and largest functions here
        try {
            System.out.println("Largest element in Set 1: " + set1.largest());
        } catch (IntegerSet.IntegerSetException e) {
            System.out.println(e.getMessage()); // Exception message
        }
        
        try {
            System.out.println("Largest element in Set 1: " + set1.smallest());
        } catch (IntegerSet.IntegerSetException e) {
            System.out.println(e.getMessage()); // Exception message
        }
        
        set1.clear();
        try {
            System.out.println("Largest element in Set 1: " + set1.largest());
        } catch (IntegerSet.IntegerSetException e) {
            System.out.println(e.getMessage()); // Exception message
        }
        try {
            System.out.println("Largest element in Set 1: " + set1.smallest());
        } catch (IntegerSet.IntegerSetException e) {
            System.out.println(e.getMessage()); // Exception message
        }
        
        try {
            System.out.println("Largest element in Set 2: " + set2.largest());
        } catch (IntegerSet.IntegerSetException e) {
            System.out.println(e.getMessage()); // Exception message
        }
        try {
            System.out.println("Smallest element in Set 2: " + set2.smallest());
        } catch (IntegerSet.IntegerSetException e) {
            System.out.println(e.getMessage()); // Exception message
        }
    
        set2.clear();
        try {
            System.out.println("Largest element in Set 2: " + set2.largest());
        } catch (IntegerSet.IntegerSetException e) {
            System.out.println(e.getMessage()); // Exception message
        }
        // Test Case 12: Attempt to find the smallest element in an empty set
        try {
            System.out.println("Smallest element in Set 2: " + set2.smallest());
        } catch (IntegerSet.IntegerSetException e) {
            System.out.println(e.getMessage()); // Exception message
        }
    }
}

