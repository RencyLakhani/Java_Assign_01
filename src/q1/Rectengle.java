/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author 57ren
 */
public class Rectengle extends Shape {
    
   
     
    private int length, width;
    public String toString(){
        
            return "length is "+length+"Width is "+ width;  
     } 
    //Polymorphism //Inheritance
    @Override
    public double getArea(int a, int b) {
        this.length = a;
        this.width = b;
        double c = super.getArea(a, b);
        return c;
    }

    public static void main(String[] args) {
        Rectengle s = new Rectengle();
        s.getArea(35, 20);
        System.out.println(s);
    }
}
