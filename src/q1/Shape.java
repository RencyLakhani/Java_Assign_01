/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author 57ren
 */
public  class  Shape implements IShape {
     String color="white";

  
    public  double getArea(int a,int b) {
        double c = a*b;
        System.out.println("area of this shape is  " + c);
        return c;
    }  
    public String toString(){
        
            return "Shape Class";  
     } 
    public static void main(String[] args)
    {
        Shape s = new Shape();
        System.out.print(s);
    }
}
