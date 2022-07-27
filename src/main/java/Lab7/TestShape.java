/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author chanakarnkingkaew
 */
public class TestShape {

    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);  // A Circle with radius = 5.5, which is a subclass of A Shape with color of RED and not filled
   
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
    
        Shape s4 = new Square(6.6);     // Upcast 
        System.out.println(s4); 
    }
}
// https://github.com/oakabc/G3Week7.git