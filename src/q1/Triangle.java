/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author 57ren
 */
public class Triangle extends Shape {

    private int base, hight;

    @Override
    public double getArea(int a, int b) {
        this.base = a;
        this.hight = b;
        double c = super.getArea(base, b);
        return c;
    }

    public String toString()
    {
        return "Base is " + base + "Hight is " + hight;
    }

    public static void main(String[] args) {
        Shape s = new Rectengle(); //DownCasting
        s.getArea(20, 20);
        System.out.println(s);
    }
}
