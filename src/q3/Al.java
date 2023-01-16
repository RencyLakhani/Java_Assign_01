/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author 57ren
 */   

public class Al {

    public static void main(String args[]) {
        
        // ArrayList
                System.out.println("ArrayList......");

        ArrayList student = new ArrayList();
        student.add("mscit"); // takes data of type Object
        student.add("mscict");
//        System.out.println("student: " + student);
//        for( Object i : student){
//            System.out.println(i);
//        }
        Iterator i = student.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
                System.out.println("********************************************");

        //Liked List 
        LinkedList<String> al2 = new LinkedList<String>();//creating linkedlist    
        al2.add("Karan");
        al2.add("Sneha");
        al2.add("Swati");
        al2.add("Nitya");
        al2.addLast("Zara");
        al2.addFirst("Ayushi");
        System.out.println("LinkedList: " + al2);

        Iterator itr = al2.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("********************************************");

        //HashSet
        System.out.println("HashSet...");
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Ferrari");
        System.out.println(cars);
        //cars.contains("Ford");

        for (String j : cars) {
            System.out.println(j);
        }

        // Creating an instance of HashSet
        HashSet hs = new HashSet();

        // By using add() method to add elements in HashSet
        hs.add(10);
        hs.add(30);
        hs.add(40);
        hs.add(20);

        /*  Here we will not get any exception because 
            null insertion is possible in HashSet
         */
        hs.add(null);

        /*  Here will not get any exception or errors 
            but it will be ignored because duplicate insertion
            is not possible 
         */
        hs.add(30);

        /*  Here we will not get any exception because hetrogenous 
            object insertion is possible in HashSet
         */
        hs.add("Java");

        // Display Current HashSet
        System.out.println("Current HashSet is :" + hs);
        System.out.println("********************************************");
        System.out.println("TreeSet...");
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("Volvo");
        tree.add("BMW");
        tree.add("Ford");
        tree.add("BMW");
        tree.add("Ferrari");
        System.out.println(tree);

        for (String k : tree) {
            System.out.println(k);
        }

    }
}
