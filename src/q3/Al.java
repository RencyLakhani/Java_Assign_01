/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 57ren
 */
public class Al {
      public static void main(String args[]) {
     
        // ArrayList
        ArrayList student = new ArrayList();
        student.add("mscit"); // takes data of type Object
        student.add("mscict");
//        System.out.println("student: " + student);
//        for( Object i : student){
//            System.out.println(i);
//        }
        Iterator i = student.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
        
      }
}
